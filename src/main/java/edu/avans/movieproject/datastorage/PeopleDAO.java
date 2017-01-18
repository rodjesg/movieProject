/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.avans.movieproject.datastorage;

import java.sql.ResultSet;
import java.sql.SQLException;
import edu.avans.movieproject.domain.People;

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
                    "SELECT * FROM role WHERE peopleID = " + peopleID + ";");

            if (resultset != null) {
                try {
                    // The membershipnumber for a member is unique, so in case the
                    // resultset does contain data, we need its first entry.
                    if (resultset.next()) {
                        int peopleIDFromDb = resultset.getInt("PeopleID");
                        String firstNameFromDb = resultset.getString("Firstname");
                        String middleNameFromDb = resultset.getString("MiddleName");
                        String lastNameFromDb = resultset.getString("Lastname");
                        String dateBirthFromDb = resultset.getString("DateBirth");
                        String diedFromDb = resultset.getString("Died");
                        String cityBirthFromDb = resultset.getString("CityBirth");
                        String countryBirthFromDb = resultset.getString("CountryBirth");

                        people = new People(
                                peopleIDFromDb,
                                firstNameFromDb,
                                middleNameFromDb,
                                lastNameFromDb,
                                dateBirthFromDb,
                                diedFromDb,
                                cityBirthFromDb,
                                countryBirthFromDb);

                        people.setPeopleID(resultset.getInt("peopleID"));
                        people.setFirstName(resultset.getString("Firstname"));
                        people.setMiddleName(resultset.getString("Middlename"));
                        people.setLastName(resultset.getString("Lastname"));
                        people.setDateBirth(resultset.getString("DatBirth"));
                        people.setDied(resultset.getString("Died"));
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

}