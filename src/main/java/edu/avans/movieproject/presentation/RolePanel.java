package edu.avans.movieproject.presentation;

import javax.swing.*;
import java.awt.*;


class RolePanel extends JPanel {
    private static final long serialVersionUID = 0;
    private JLabel homeBanner = new JLabel("Role menu");


     RolePanel() {

        homeBanner.setHorizontalTextPosition(JLabel.CENTER);
        homeBanner.setFont(new Font("Arial", Font.BOLD, 18));
        homeBanner.setForeground(Color.BLACK);



        homeBanner.setBounds(420, 10, 100, 70);



        add(homeBanner);
    }
}