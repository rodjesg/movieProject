/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.avans.movieproject.presentation;

import edu.avans.movieproject.businesslogic.MovieManager;
import edu.avans.movieproject.domain.Rol;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author rodneygeerlings
 */
public class RolView extends JPanel {

    private JLabel rolIDLabel, rolNameLabel, descriptionLabel;
    private JTextField rolIDInput, rolNameInput, descriptionInput;
    private JButton rolSearchButton, editButton, createButton;
    private final MovieManager manager;
    private Rol currentRol;

    public RolView() {



    class RolSearchHandler implements ActionListener {

        private Object rolID;

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == rolID) {
                String rolID = rolIDInput.getText();
             

            }

        }
    }

