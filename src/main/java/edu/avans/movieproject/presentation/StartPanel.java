/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.avans.movieproject.presentation;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author rodneygeerlings
 */
public class StartPanel extends JPanel {

    private static final long serialVersionUID = 1L;

    private final JLabel welcomeUser = new JLabel("Welcome");
    private final JButton actors = new JButton("Actors");
    private final JButton movies = new JButton("Movies");
    private final JButton rol = new JButton("Rol");
 

    public StartPanel() {
        setLayout(null);
        setSize(900, 750);

        welcomeUser.setHorizontalTextPosition(JLabel.CENTER);
        welcomeUser.setFont(new Font("Arial", Font.BOLD, 18));
        welcomeUser.setForeground(Color.WHITE);
        actors.setFont(new Font("Arial", Font.BOLD, 14));
        movies.setFont(new Font("Arial", Font.BOLD, 14));
        rol.setFont(new Font("Arial", Font.BOLD, 14));
       

        //Handlers for each button
        actors.addActionListener(new NewFrameHandler());
        movies.addActionListener(new NewFrameHandler());
        rol.addActionListener(new NewFrameHandler());

        //Layout with 3 equal buttons
        welcomeUser.setBounds(420, 10, 100, 70);
        actors.setBounds(615, 200, 150, 150);
        movies.setBounds(360, 200, 150, 150);
        rol.setBounds(105, 200, 150, 150);
       

        //add JButtons and JLabel to panel
        add(welcomeUser);
        add(actors);
        add(movies);
        add(rol);
      

    }

    class NewFrameHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == movies) {
                //Open new main.getyourolyweight.domain.Skill Dialog
                MovieView movieView = new MovieView();
                movieView.setVisible(true);
            } else if (e.getSource() == rol) {
                //Open new Progress Dialog
                RolView rolView = new RolView();
                rolView.setVisible(true);
            } else if (e.getSource() == actors) {
                //Open new main.getyourolyweight.domain.Atlete Dialog
                PeopleView peopleView = new PeopleView();
                peopleView.setVisible(true);
            }

        }
    }
    
}
