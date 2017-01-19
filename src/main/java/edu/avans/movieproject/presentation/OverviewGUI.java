/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.avans.movieproject.presentation;

import edu.avans.movieproject.businesslogic.MovieManager;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author rodneygeerlings
 */
public class OverviewGUI extends JFrame {
    private static final long serialVersionUID = 1L;
 
    public static void main(String[] args) {
            // TODO code application logic here
        
        
    
    JFrame frame = new OverviewGUI();
    frame.setSize(1024, 1280);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("Movie DB");
    frame.setVisible(true);
}
    
    
        
    }
