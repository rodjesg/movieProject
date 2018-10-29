package edu.avans.movieproject.main;

import edu.avans.movieproject.businesslogic.MovieManager;

import javax.swing.*;
import java.awt.Panel;

public class OverviewGUI extends JFrame {

    private JPanel panel = new JPanel();
    private JLabel img;
    public OverviewGUI(MovieManager movieManager){
        JFrame frame = new JFrame();
        frame.setSize(900, 700);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new StartPanel());
        frame.setTitle("MovieDB");

        //background image
        ImageIcon icon1 = new ImageIcon();
        img = new JLabel(icon1);
        img.setBounds(0, 0, 900, 750);
        img.setVisible(true);


        panel.setBounds(0,0, 900, 750);
        panel.add(img);
        panel.setVisible(true);
        panel.repaint();

        frame.add(panel);
        frame.setVisible(true);
        frame.repaint();

    }
}