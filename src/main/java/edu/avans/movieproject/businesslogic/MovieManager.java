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

import java.util.Date;
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
    
    //Manager to createMovie
    public void createMovie(int movieID, String title, Date releaseDate, int rating) {
        MovieDAO MovieDAO = new MovieDAO();
        MovieDAO.createMovie(movieID, title, (java.sql.Date) releaseDate, rating);

    }

    //Manager to insertRol 
    public void insertRol(int rolID, String rolName, String description) {
        RolDAO RolDAO = new RolDAO();
        RolDAO.insertRol(rolID, rolName, description);
    }

    //Manager to createPeople 
    public void insertPeople(int peopleID, String firstName, String middleName, String lastName, Date dateBirth, String cityBirth, String countryBirth) {
        PeopleDAO PeopleDAO = new PeopleDAO();
        PeopleDAO.insertPeople(peopleID, firstName, middleName, lastName, (java.sql.Date) dateBirth, cityBirth, countryBirth);
    }

}
