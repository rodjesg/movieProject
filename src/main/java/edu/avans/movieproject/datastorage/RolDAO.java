/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.avans.movieproject.datastorage;

import edu.avans.movieproject.domain.Rol;
import java.sql.*;

/**
 *
 * @author rgeerlings
 */

public class RolDAO {

    public RolDAO() {

    }

    public Rol findRol(int rolID) {
        Rol rol = null;

        // First open a database connnection
        DatabaseConnection connection = new DatabaseConnection();
        if (connection.openConnection()) {
            // If a connection was successfully setup, execute the SELECT statement.
            ResultSet resultset = connection.executeSQLSelectStatement(
                    "SELECT * FROM Rol WHERE RolID = " + rolID + ";");

            if (resultset != null) {
                try {
                    // The membershipnumber for a member is unique, so in case the
                    // resultset does contain data, we need its first entry.
                    if (resultset.next()) {
                        int rolIDFromDb = resultset.getInt("rolID");
                        String rolNameFromDb = resultset.getString("Rolname");
                        String descriptionFromDb = resultset.getString("Description");

                        rol = new Rol(
                                rolIDFromDb,
                                rolNameFromDb,
                                descriptionFromDb);

                        rol.setRolID(resultset.getInt("RolID"));
                        rol.setRolName(resultset.getString("Rolname"));
                        rol.setDescription(resultset.getString("Description"));

                    }
                } catch (SQLException e) {
                    System.out.println(e);
                    rol = null;
                }
            }
            // else an error occurred leave 'member' to null.

            // We had a database connection opened. Since we're finished,
            // we need to close it.
            connection.closeConnection();
        }

        return rol;
    }

    


    //INSERT query 
    public boolean insertRol(int rolID, String rolName, String description) {
        boolean result = false;

        // First open the database connection.
        DatabaseConnection connection = new DatabaseConnection();
        if (connection.openConnection()) {
            // Execute the insert statement 
            result = connection.executeSqlDmlStatement(
                    "INSERT INTO `rol`(RolID, Rolname, description) VALUES('" + rolID + "', '" + rolName + "', '" + description + "');");

            // Finished with the connection, so close it.
            connection.closeConnection();
        }
        // else an error occurred leave 'member' to null.


        return result;
    }

}
