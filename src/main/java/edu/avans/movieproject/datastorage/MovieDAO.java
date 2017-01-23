/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.avans.movieproject.datastorage;

import edu.avans.movieproject.domain.Movie;
import java.sql.*;

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
                    "SELECT * FROM Movie WHERE MovieID = " + movieID + ";");

            if (resultset != null) {
                try {
                    // The membershipnumber for a member is unique, so in case the
                    // resultset does contain data, we need its first entry.
                    if (resultset.next()) {
                        int movieIDFromDb = resultset.getInt("MovieID");
                        String movieTitleFromDb = resultset.getString("Title");
                        String movieReleaseDateFromDb = resultset.getString("ReleaseDate");
                        String movieRatingFromDb = resultset.getString("Rating");
                        int peopleIDFromDb = resultset.getInt("PeopleID");
                        int rolIDFromDb = resultset.getInt("RolID");

                        movie = new Movie(
                                movieIDFromDb,
                                movieTitleFromDb,
                                movieReleaseDateFromDb,
                                movieRatingFromDb,
                                peopleIDFromDb,
                                rolIDFromDb);

                        movie.setMovieID(resultset.getInt("MovieID"));
                        movie.setTitle(resultset.getString("Firstname"));
                        movie.setReleaseDate(resultset.getString("ReleaseDate"));
                        movie.setRating(resultset.getString("Lastname"));

                    }
                } catch (SQLException e) {
                    System.out.println(e);
                    movie = null;
                }
            }
            // else an error occurred leave 'member' to null.

            // We had a database connection opened. Since we're finished,
            // we need to close it.
            connection.closeConnection();
        }

        return movie;
    }
}
