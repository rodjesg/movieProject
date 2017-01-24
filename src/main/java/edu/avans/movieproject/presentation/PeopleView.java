/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.avans.movieproject.presentation;

import javax.swing.*;
/**
 *
 * @author rodneygeerlings
 */
public class PeopleView extends JPanel{
    private static final long serialVersionUID = 1L;
    
        private JPanel panelSkill = new JPanel();


        public PeopleView() {
            //choose your skill dialog
            PeopleView peopleView = new PeopleView();
  
            peopleView.setSize(900, 750);
        //    peopleView.setContentPane(new PeopleView());
         

            

            peopleView.add(panelSkill);
            peopleView.setVisible(true);
            peopleView.repaint();

        }

    

    
    }
  
