package edu.avans.movieproject.presentation;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class StartPanel extends JPanel {

    //Start menu with 3 Button-options
    private static final long serialVersionUID = 0;

    private JButton movieButton = new JButton("Movie");
    private JButton actorsButton = new JButton("Actors");
    private JButton roleButton = new JButton("Role");
    private OverviewGUI.MainFrame mainFrame;

    StartPanel(OverviewGUI.MainFrame frame) {
        mainFrame = frame;
        JLabel homeBanner = new JLabel("Menu");
        homeBanner.setHorizontalTextPosition(JLabel.CENTER);
        homeBanner.setFont(new Font("Arial", Font.BOLD, 18));
        homeBanner.setForeground(Color.BLACK);
        movieButton.setFont(new Font("Arial", Font.BOLD, 14));
        actorsButton.setFont(new Font("Arial", Font.BOLD, 14));
        roleButton.setFont(new Font("Arial", Font.BOLD, 14));

        //Handlers for each button
        movieButton.addActionListener(new NewFrameHandler(this));
        actorsButton.addActionListener(new NewFrameHandler(this));
        roleButton.addActionListener(new NewFrameHandler(this));

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
        private JPanel panel;

        NewFrameHandler(JPanel panel){
            this.panel = panel;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == movieButton) {
                // Open the Movie Panel
                panel = new MoviePanel(mainFrame);
            } else if (e.getSource() == actorsButton) {
                // Open the Actors Panel
                panel = new ActorsPanel(mainFrame);
            } else if (e.getSource() == roleButton) {
                // Open the Actors Role Panel
                panel = new RolePanel(mainFrame);
            }

            mainFrame.getContentPane().removeAll();
            mainFrame.getContentPane().add(panel);
            mainFrame.setVisible(true);
        }
    }
}