package edu.avans.movieproject.presentation;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class StartPanel extends JPanel {

    //Start menu with 3 Button-options
    private static final long serialVersionUID = 0;
    private JFrame frame;
    private JPanel panel;

    private JLabel homeBanner = new JLabel("Menu");
    private JButton movieButton = new JButton("Movie");
    private JButton actorsButton = new JButton("Actors");
    private JButton roleButton = new JButton("Role");

    StartPanel(JFrame frame) {
        this.frame = frame;
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
            JPanel panel = null;

            if (e.getSource() == movieButton) {
                // Open the Movie Panel
               panel = new MoviePanel(panel);
            } else if (e.getSource() == actorsButton) {
                // Open the Actors Panel
                panel = new ActorsPanel(panel);
            } else {
                // Open the Actors Role Panel
               panel = new RolePanel(panel);
            }
            frame.getContentPane().removeAll();
            frame.getContentPane().add(panel);
            frame.setVisible(true);
        }
    }



}