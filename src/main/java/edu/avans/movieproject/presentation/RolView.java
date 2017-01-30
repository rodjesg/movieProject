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

    private JLabel atleteEmailLabel, firstNameLabel, lastNameLabel;
    private JTextField atleteEmailInput, firstNameInput, lastNameInput;
    private JButton rolSearchButton, editButton;
    private final MovieManager manager;
    private Rol currentRol;

    public RolView(MovieManager movieManager) {
        setLayout( null);
        atleteLabel = new JLabel("main.getyourolyweight.domain.Atlete");
        newAtleteLabel = new JLabel("New main.getyourolyweight.domain.Atlete");
        atleteEmailLabel = new JLabel("Emailadres: ");
        atleteEmailInput = new JTextField( 30 );
        firstNameLabel = new JLabel("Fisrtname: ");
        firstNameInput = new JTextField( 30 );
        
        createButton = new JButton("Create");
        manager = movieManager;
        currentRol = null;

        atleteLabel.setBounds(220, 20, 100, 50);
        newAtleteLabel.setBounds(670, 20, 100, 50);

        atleteEmailLabel.setBounds(20, 100, 100, 50);
        atleteEmailInput.setBounds(100, 100, 200, 50);
        newAtleteEmailLabel.setBounds(470, 100, 100, 50);
        

        add(atleteLabel);
        add(newAtleteLabel);
        add(atleteEmailLabel);
        

    }

  
        class EmailSearchHandler implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == emailSearchButton) {
                    String email = atleteEmailInput.getText();
                    doFindAtlete(email);

                }


            }
        }


            private void doFindAtlete(String email) {
                currentRol = manager.findAtlete(email);
                firstNameInput.setText(currentRol.getFirtName());
                lastNameInput.setText(currentRol.getLastName());
                String atleteInfo = "Atleet niet gevonden";
            }
        }



