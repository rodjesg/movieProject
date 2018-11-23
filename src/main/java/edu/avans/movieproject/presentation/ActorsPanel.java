package edu.avans.movieproject.presentation;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ActorsPanel extends JPanel {
    private static final long serialVersionUID = 0;
    private JPanel previousPanel;
    private JButton backButton;
    private JLabel locationBanner = new JLabel("Actors menu");



     ActorsPanel(JPanel panel) {
         locationBanner.setHorizontalTextPosition(JLabel.LEFT);
         locationBanner.setFont(new Font("Arial", Font.BOLD, 18));
         locationBanner.setForeground(Color.BLACK);
         locationBanner.setBounds(300, 300, 100, 100);
         previousPanel = panel;
         backButton = new JButton("Back");
         backButton.setBounds(350, 350, 100, 100);
         backButton.addActionListener(new newButtonAction());



        add(locationBanner);
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