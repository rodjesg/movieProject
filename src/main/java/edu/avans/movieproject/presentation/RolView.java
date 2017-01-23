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
public class RolView extends JPanel{
    
        private JPanel panelSkill = new JPanel();


        public RolView() {
            //choose your skill dialog
            RolView rolView = new RolView();
  
            rolView.setSize(900, 750);
            rolView.setContentPane(new RolView());
         

            

            rolView.add(panelSkill);
            rolView.setVisible(true);
            rolView.repaint();

        }

    private void setContentPane(RolView movieView) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    }
  
