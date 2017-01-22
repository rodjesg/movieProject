/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.avans.movieproject.main;

import edu.avans.movieproject.businesslogic.MovieManager;
import edu.avans.movieproject.presentation.OverviewGUI;

/**
 *
 * @author rodneygeerlings
 */

public class Main {
   
   
  
    public static void main(String[] args) {
       OverviewGUI ui = new OverviewGUI(new MovieManager());
        ui.setVisible( true);
    }

}