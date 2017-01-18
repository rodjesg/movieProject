/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.avans.movieproject.datastorage;

import edu.avans.movieproject.domain.People;
import edu.avans.movieproject.domain.Movie;
import edu.avans.movieproject.domain.Rol;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author rgeerlings
 */
public class MovieDAO {

    public MovieDAO() {

    }

    public Movie findMovie(int movieID) {
        Movie movie = null;

        // First open a database connnection
        DatabaseConnection connection = new DatabaseConnection();
        if (connection.openConnection()) {
            // If a connection was successfully setup, execute the SELECT statement.
            ResultSet resultset = connection.executeSQLSelectStatement(
                    "SELECT * FROM role WHERE movieID = " + movieID + ";");

            if (resultset != null) {
                try {
                    // The membershipnumber for a member is unique, so in case the
                    // resultset does contain data, we need its first entry.
                    if (resultset.next()) {
                        int movieIDFromDb = resultset.getInt("MovieID");
                        String movieTitleFromDb = resultset.getString("Title");
                        String movieReleaseDateFromDb = resultset.getString("ReleaseDate");
                         String movieRatingFromDb = resultset.getString("Rating");
                         int rolIDFromDb = resultset.getInt("RolID");
                          int peopleIDFromDb = resultset.getInt("PeopleID");
                        

                        movie = new Movie(
                                movieIDFromDb,
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
