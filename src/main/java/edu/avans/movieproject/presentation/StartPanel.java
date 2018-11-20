package edu.avans.movieproject.presentation;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 class StartPanel extends JPanel {

    //Start menu with 3 Button-options
    private static final long serialVersionUID = 0;

    private JLabel homeBanner = new JLabel("Menu");
    private JButton movieButton = new JButton("Movie");
    private JButton actorsButton = new JButton("Actors");
    private JButton roleButton = new JButton("Role");

    StartPanel() {

        homeBanner.setHorizontalTextPosition(JLabel.CENTER);
        homeBanner.setFont(new Font("Arial", Font.BOLD, 18));
        homeBanner.setForeground(Color.BLACK);
        movieButton.setFont(new Font("Arial", Font.BOLD, 14));
        actorsButton.setFont(new Font("Arial", Font.BOLD, 14));
        roleButton.setFont(new Font("Arial", Font.BOLD, 14));

        //Handlers for each button
        movieButton.addActionListener(new NewFrameHandler());
        actorsButton.addActionListener(new NewFrameHandler());
        roleButton.addActionListener(new NewFrameHandler());

        //Layout with 3 equal buttons
        homeBanner.setBounds(420, 10, 100, 70);
        movieButton.setBounds(615, 200, 150, 150);
        actorsButton.setBounds(360, 200, 150, 150);
        roleButton.setBounds(105, 200, 150, 150);

        //add JButtons and JLabel to panel
        add(homeBanner);
        add(movieButton);
        add(actorsButton);
        add(roleButton);

    }

    //Handlers StartPanel
   class NewFrameHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == movieButton) {
                // Open the Movie Panel
                MoviePanel moviePanel = new MoviePanel();
                moviePanel.setVisible(true);
            } else if (e.getSource() == actorsButton) {
                // Open the Actors Panel
                ActorsPanel actorsPanel = new ActorsPanel();
                actorsPanel.setVisible(true);
            } else if (e.getSource() == roleButton) {
                // Open the Actors Role Panel
                RolePanel rolePanel = new RolePanel();
                rolePanel.setVisible(true);
            }

        }
    }
 }