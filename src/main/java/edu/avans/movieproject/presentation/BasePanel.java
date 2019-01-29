package edu.avans.movieproject.presentation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasePanel extends JPanel {

    private static final long serialVersionUID = 0;
    private OverviewGUI.MainFrame mainFrame;

    public static void main(String[] args) {
    }

    BasePanel(String panelTitle, OverviewGUI.MainFrame frame) {
        this.mainFrame = frame;
        this.setBounds(0, 0, mainFrame.getWidth(), mainFrame.getHeight());

        JLabel locationBanner = new JLabel(panelTitle);
        locationBanner.setHorizontalTextPosition(JLabel.LEFT);
        locationBanner.setFont(new Font("Arial", Font.BOLD, 18));
        locationBanner.setForeground(Color.BLACK);
        locationBanner.setBounds(300, 300, 100, 100);

        JButton backButton = new JButton("Back");
        backButton.setBounds(350, 350, 100, 100);
        backButton.addActionListener(new GoBackHandler());

        add(locationBanner);
        add(backButton);
    }

    //Handlers Button go back click
    class GoBackHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            mainFrame.goBack();
        }
    }
}
