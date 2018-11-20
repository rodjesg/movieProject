package edu.avans.movieproject.presentation;

import javax.swing.*;
import java.awt.*;

class MoviePanel extends JPanel {
    private static final long serialVersionUID = 0;
    private JLabel homeBanner = new JLabel("Movie menu");

     MoviePanel() {
        homeBanner.setHorizontalTextPosition(JLabel.CENTER);
        homeBanner.setFont(new Font("Arial", Font.BOLD, 18));
        homeBanner.setForeground(Color.BLACK);
        homeBanner.setBounds(420, 10, 100, 100);

        add(homeBanner);

    }
}
