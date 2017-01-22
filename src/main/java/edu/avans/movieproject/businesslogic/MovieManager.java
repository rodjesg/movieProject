/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.avans.movieproject.businesslogic;

import edu.avans.movieproject.datastorage.PeopleDAO;
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

    //Manager to findAtlete in class AtleteDAO
    public People findPeople(int peopleID) {
     return null;

    }
}
