/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.avans.movieproject.presentation;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import edu.avans.movieproject.domain.Movie;

/**
 *
 * @author rodneygeerlings
 */
public class MovieOverviewUI extends JFrame{
    private static final long serialVersionUID = 1L;
    
    
    public static void main (String args[]){
        JFrame frame = new MovieOverviewUI();
        frame.setSize (1024, 768);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setTitle("MovieProject");
        frame.setContentPane( new Paneel());
        frame.setVisible (true);       
        
    }
}