/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.avans.movieproject.businesslogic;

import edu.avans.movieproject.domain.Movie;

/**
 *
 * @author rodneygeerlings
 */
public interface MovieManager {
    
      public Movie findMovie(int movieID);
    
}
