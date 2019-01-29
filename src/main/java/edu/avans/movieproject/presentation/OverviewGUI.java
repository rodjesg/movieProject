package edu.avans.movieproject.presentation;

import javax.swing.*;

public class OverviewGUI extends JFrame {

    private static final long serialVersionUID = 0;

    public OverviewGUI(){
        MainFrame frame = new MainFrame();
        frame.setSize(1024, 1024);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new StartPanel(frame));
        frame.setTitle("MovieDB");

        JPanel panel = new JPanel();
        panel.setBounds(0,0, 1024, 1024);
        panel.setVisible(true);
        panel.repaint();

        frame.add(panel);
        frame.setVisible(true);
        frame.repaint();
    }

    class MainFrame extends JFrame {
        void goBack() {
            getContentPane().removeAll();
            getContentPane().add(new StartPanel(this));
            setVisible(true);
        }
    }
}