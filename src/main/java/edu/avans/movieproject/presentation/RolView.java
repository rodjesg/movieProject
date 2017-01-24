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
public class RolView extends JPanel {

    private static final long serialVersionUID = 1L;

    private final JPanel panelSkill = new JPanel();

    public RolView() {
        //choose your skill dialog
        RolView rolView = new RolView();

        rolView.setSize(900, 750);
        //rolView.setContentPane(new RolView());

        rolView.add(panelSkill);
        rolView.setVisible(true);
        rolView.repaint();

    }
}
