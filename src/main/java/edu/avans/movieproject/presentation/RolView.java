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

    public RolView(MovieManager movieManager) {

        rolIDLabel = new JLabel("main.getyourolyweight.domain.Atlete");
        rolNameLabel = new JLabel("New main.getyourolyweight.domain.Atlete");
        descriptionLabel = new JLabel("Emailadres: ");
        rolIDInput = new JTextField(30);
        rolNameInput = new JTextField(30);
        descriptionInput = new JTextField(30);

        createButton = new JButton("Create");
        manager = movieManager;
        currentRol = null;

        rolIDLabel.setBounds(220, 20, 100, 50);
        rolNameLabel.setBounds(670, 20, 100, 50);

        descriptionLabel.setBounds(20, 100, 100, 50);

        add(rolIDLabel);
        add(rolNameLabel);
        add(descriptionLabel);
        add(rolIDInput);
        add(rolNameInput);
        add(descriptionInput);

    }

    class RolSearchHandler implements ActionListener {

        private Object rolID;

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == rolID) {
                String rolID = rolID.getText();
                doFindRol(rolID);

            }

        }
    }

    private void doFindRol(int rolID) {
        currentRol = manager.findRol(rolID);
        rolIDInput.setText(currentRol.getRolID());
        rolNameInput.setText(currentRol.getRolName());
        String rolInfo = "Rol niet gevonden";
    }
}
