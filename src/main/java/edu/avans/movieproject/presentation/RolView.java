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
    private Rol currentRol;

    public RolView() {

        rolIDLabel = new JLabel("RolID");
        rolNameLabel = new JLabel("Rolname");
        descriptionLabel = new JLabel("Description ");
        rolIDInput = new JTextField(30);
        rolNameInput = new JTextField(30);
        descriptionInput = new JTextField(30);


        class RolSearchHandler implements ActionListener {

            private Object rolID;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == rolID) {
                    String rolID = rolIDInput.getText();

                }

            }
        }

    }

    
}

