package edu.avans.movieproject.presentation;


import javax.swing.*;

public class OverviewGUI extends JFrame {

    private static final long serialVersionUID = 0;
    private JPanel panel = new JPanel();


    public OverviewGUI(){
        JFrame frame = new JFrame();
        frame.setSize(1024, 1024);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new StartPanel(frame));
        frame.setTitle("MovieDB");

        panel.setBounds(0,0, 1024, 1024);
        panel.setVisible(true);
        panel.repaint();

        frame.add(panel);
        frame.setVisible(true);
        frame.repaint();

    }
}