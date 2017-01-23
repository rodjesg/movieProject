/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.avans.movieproject.presentation;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author rodneygeerlings
 */
public class PeopleView extends JPanel{
    
        private JPanel panelSkill = new JPanel();


        public PeopleView() {
            //choose your skill dialog
            PeopleView peopleView = new PeopleView();
  
            peopleView.setSize(900, 750);
            peopleView.setContentPane(new PeopleView());
         

            

            peopleView.add(panelSkill);
            peopleView.setVisible(true);
            peopleView.repaint();

        }

    private void setContentPane(PeopleView movieView) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    }
  
