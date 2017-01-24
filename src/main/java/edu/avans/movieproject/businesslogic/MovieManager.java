/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.avans.movieproject.businesslogic;

import edu.avans.movieproject.datastorage.PeopleDAO;
import edu.avans.movieproject.datastorage.MovieDAO;
import edu.avans.movieproject.datastorage.RolDAO;
import edu.avans.movieproject.domain.Movie;
import edu.avans.movieproject.domain.People;
import edu.avans.movieproject.domain.Rol;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author rodneygeerlings
 */
public class MovieManager {

    private final Map<String, People> people;
    private final Map<String, Movie> movie;
    private final Map<String, Rol> rol;

    public MovieManager() {
        people = new HashMap<>();
        movie = new HashMap<>();
        rol = new HashMap<>();

    }

    //Manager for finding People
    public People findPeople(int peopleID) {
        People people = people.get(peopleID);

        if (people == null) {
            PeopleDAO peopleDAO = new PeopleDAO();
            people = peopleDAO.findPeople(peopleID);
            people.put(peopleID, people);
        }
        return people;

    }

    //Manager for finding People
    public Movie findMovie(int movieID) {
        Movie movie = movie.get(movieID);

        if (movie == null) {
            MovieDAO movieDAO = new MovieDAO();
            movie = movieDAO.findMovie(movieID);
            movie.put(movieID, movie);
        }
        return movie;

    }

    //Manager to createMovie
    public void createMovie(int movieID, String title, String releaseDate, int rating, int peopleID, int rolID) {
        MovieDAO movieDAO = new MovieDAO();
        MovieDAO.createMovie(movieID, title, releaseDate, rating, peopleID, rolID);

    }

    //Manager to insertRol 
    public void insertRol(int rolID, String rolName, String description) {
        RolDAO RolDAO = new RolDAO();
        RolDAO.insertRol(rolID, rolName, description);
    }

    //Manager to createPeople 
    public void insertPeople(int peopleID, String firstName, String middleName, String lastName, String dateBirth, String cityBirth, String countryBirth) {
        PeopleDAO PeopleDAO = new PeopleDAO();
        PeopleDAO.insertPeople(peopleID, firstName, middleName, lastName, dateBirth, cityBirth, countryBirth);
    }

}
