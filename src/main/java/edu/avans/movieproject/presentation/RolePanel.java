package edu.avans.movieproject.presentation;

import javax.swing.*;
import java.awt.*;


class RolePanel extends JPanel {
    private static final long serialVersionUID = 0;
    private JPanel previousPanel;
    private JButton backButton;
    private JLabel homeBanner = new JLabel("Role menu");


     RolePanel(JPanel panel) {

        previousPanel = panel;
        backButton = new JButton("Back");
        backButton.setBounds(700, 30, 100, 100);
        homeBanner.setHorizontalTextPosition(JLabel.LEFT);
        homeBanner.setFont(new Font("Arial", Font.BOLD, 18));
        homeBanner.setForeground(Color.BLACK);
        homeBanner.setBounds(30, 300, 100, 70);



        add(homeBanner);
        add(backButton);
    }
}