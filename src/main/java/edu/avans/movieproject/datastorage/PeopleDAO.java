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
      
      public RolDAO() {
    
    }
       public Rol findRol(int rolID) {
           Rol rol = null;
           
               // First open a database connnection
        DatabaseConnection connection = new DatabaseConnection();
        if (connection.openConnection()) {
            // If a connection was successfully setup, execute the SELECT statement.
            ResultSet resultset = connection.executeSQLSelectStatement(
                    "SELECT * FROM role WHERE rolID = " + rolID + ";");

            if (resultset != null) {
                try {
                    // The membershipnumber for a member is unique, so in case the
                    // resultset does contain data, we need its first entry.
                    if (resultset.next()) {
                        int rolIDFromDb = resultset.getInt("roleID");
                        String rolNameFromDb = resultset.getString("Rolname");
                        String descriptionFromDb = resultset.getString("Description");

                        rol = new Rol(
                                rolIDFromDb,
                                rolNameFromDb,
                                descriptionFromDb);

                        rol.setRolID(resultset.getInt("RoleID"));
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
    
    

}

