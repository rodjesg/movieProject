package edu.avans.movieproject.main;

import javax.swing.*;
import java.awt.*;

public class StartPanel extends JPanel {

    //Start menu with 3 Button-options
    private JLabel homeBanner = new JLabel("Welcome");
    private JButton movieButton = new JButton("Movie");
    private JButton actorsButton = new JButton("Actors");
    private JButton roleButton = new JButton("Role");

    public StartPanel() {
        setLayout(null);
        setSize(900, 750);



    }
}