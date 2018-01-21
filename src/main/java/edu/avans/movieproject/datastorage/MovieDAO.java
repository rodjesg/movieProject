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

    public static void createMovie(int movieID, String title, Date releaseDate, int rating) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

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
                        Date movieReleaseDateFromDb = resultset.getDate("ReleaseDate");
                        int movieRatingFromDb = resultset.getInt("Rating");

                        movie = new Movie(
                                movieIDFromDb,
                                movieTitleFromDb,
                                movieReleaseDateFromDb,
                                movieRatingFromDb);

                        movie.setMovieID(resultset.getInt("MovieID"));
                        movie.setTitle(resultset.getString("Title"));
                        movie.setReleaseDate(resultset.getDate("ReleaseDate"));
                        movie.setRating(resultset.getInt("Rating"));

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


    public boolean insertMovie(int movieID, String movieTitle, Date releaseDate, int rating) {
        boolean result = false;

        // First open the database connection.
        DatabaseConnection connection = new DatabaseConnection();
        if (connection.openConnection()) {
            // Execute the insert statement
            result = connection.executeSqlDmlStatement(
                    "INSERT INTO `movie`(MovieID, MovieTitle, ReleaseDate, Rating) VALUES('" + movieID + "', '" + movieTitle + "', '" + releaseDate + "', ' "+ rating + "');");

            // Finished with the connection, so close it.
            connection.closeConnection();
        }
        // else an error occurred leave 'member' to null.


        return result;
    }
}
