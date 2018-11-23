package edu.avans.movieproject.presentation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MoviePanel extends JPanel {
    private static final long serialVersionUID = 0;
    private JPanel previousPanel;
    private JButton backButton;
    private JLabel movieBanner = new JLabel("Movie menu");

    MoviePanel(JPanel panel) {
        previousPanel = panel;
        backButton = new JButton("Back");
        backButton.setBounds(70, 30, 100, 100);
        backButton.addActionListener(new newButtonAction());
        movieBanner.setHorizontalTextPosition(JLabel.LEFT);
        movieBanner.setFont(new Font("Arial", Font.BOLD, 18));
        movieBanner.setForeground(Color.BLACK);
        movieBanner.setBounds(30, 0, 100, 100);

        add(movieBanner);
        add(backButton);


    }

    class newButtonAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == backButton) {
                JPanel panel = previousPanel;

            }

        }
    }
}