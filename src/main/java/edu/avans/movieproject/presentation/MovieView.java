/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.avans.movieproject.presentation;


import javax.swing.*;

/**
 *
 * @author rodneygeerlings
 */
public class MovieView extends JPanel{
    private static final long serialVersionUID = 1L;
    
        private JPanel panelSkill = new JPanel();


        public MovieView() {
            //choose your skill dialog
            MovieView movieView = new MovieView();
  
            movieView.setSize(900, 750);
     //    movieView.setContentPane(new MovieView());
         

            

            movieView.add(panelSkill);
            movieView.setVisible(true);
            movieView.repaint();

        }

    

    
    }
  
