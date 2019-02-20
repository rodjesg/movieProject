/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.avans.movieproject.datastorage;

import edu.avans.movieproject.domain.People;
import java.sql.*;

/**
 *
 * @author rgeerlings
 */
public class PeopleDAO {

    public PeopleDAO() {

    }

    public People findPeople(int peopleID) {
        People people = null;

        // First open a database connnection
        DatabaseConnection connection = new DatabaseConnection();
        if (connection.openConnection()) {
            // If a connection was successfully setup, execute the SELECT statement.
            ResultSet resultset = connection.executeSQLSelectStatement(
                    "SELECT * FROM People WHERE PeopleID = " + peopleID + ";");

            if (resultset != null) {
                try {
                    // The membershipnumber for a member is unique, so in case the
                    // resultset does contain data, we need its first entry.
                    if (resultset.next()) {
                        int peopleIDFromDb = resultset.getInt("PeopleID");
                        String firstNameFromDb = resultset.getString("Firstname");
                        String middleNameFromDb = resultset.getString("MiddleName");
                        String lastNameFromDb = resultset.getString("Lastname");
                        Date dateBirthFromDb = resultset.getDate("DateBirth");
                        String cityBirthFromDb = resultset.getString("CityBirth");
                        String countryBirthFromDb = resultset.getString("CountryBirth");

                        people = new People(
                                peopleIDFromDb,
                                firstNameFromDb,
                                middleNameFromDb,
                                lastNameFromDb,
                                dateBirthFromDb,
                                cityBirthFromDb,
                                countryBirthFromDb);

                        people.setPeopleID(resultset.getInt("peopleID"));
                        people.setFirstName(resultset.getString("Firstname"));
                        people.setMiddleName(resultset.getString("Middlename"));
                        people.setLastName(resultset.getString("Lastname"));
                        people.setDateBirth(resultset.getDate("DatBirth"));
                        people.setCityBirth(resultset.getString("CityBirth"));
                        people.setCountryBirth(resultset.getString("CountryBirh"));

                    }
                } catch (SQLException e) {
                    System.out.println(e);
                    people = null;
                }
            }
            // else an error occurred leave 'member' to null.

            // We had a database connection opened. Since we're finished,
            // we need to close it.
            connection.closeConnection();
        }

        return people;
    }
    
    //INSERT query 
    public boolean insertPeople(int peopleID, String firstName, String middleName, String lastName, Date dateBirth , String cityBirth, String countryBirth) {
        boolean result = false;

        // First open the database connection.
        DatabaseConnection connection = new DatabaseConnection();
        if (connection.openConnection()) {
            // Execute the insert statement 
            result = connection.executeSqlDmlStatement(
                    "INSERT INTO `people`(PeopleID, Firstname, Middlename, Lastname, dateBirth, cityBirth, countryBirth) VALUES('" + peopleID + "', '" + firstName + "', '" + middleName + "' , '" + lastName + "', '" + dateBirth + "', '" + cityBirth + "', '" + countryBirth + "');");

            // Finished with the connection, so close it.
            connection.closeConnection();
        }
        // else an error occurred leave 'member' to null.


        return result;
    }
}
