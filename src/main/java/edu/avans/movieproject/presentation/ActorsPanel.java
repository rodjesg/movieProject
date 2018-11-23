package edu.avans.movieproject.presentation;


import javax.swing.*;
import java.awt.*;

class ActorsPanel extends JPanel {
    private static final long serialVersionUID = 0;
    private JPanel previousPanel;
    private JButton backButton;
    private JLabel actorsBanner = new JLabel("Actors menu");



     ActorsPanel(JPanel panel) {

        previousPanel = panel;
        backButton = new JButton("Back");
        backButton.setBounds(700, 30, 100, 100);
        actorsBanner.setHorizontalTextPosition(JLabel.LEFT);
        actorsBanner.setFont(new Font("Arial", Font.BOLD, 18));
        actorsBanner.setForeground(Color.BLACK);
        actorsBanner.setBounds(30, 30, 100, 70);



        add(actorsBanner);
        add(backButton);
    }

}