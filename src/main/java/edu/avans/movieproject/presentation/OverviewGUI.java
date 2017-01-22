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
    
    
    private final JPanel panel = new JPanel();

    public OverviewGUI(MovieManager movieManager) {
            JFrame frame = new JFrame();
            frame.setSize(1024, 1280);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setContentPane(new StartPanel());
            frame.setTitle("Movie DB");

            panel.setBounds(0,0, 900, 750);
            panel.setVisible(true);
            panel.repaint();

            frame.add(panel);
            frame.setVisible(true);
            frame.repaint();

        }
        
 
}