/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.avans.movieproject.presentation;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author rodneygeerlings
 */
public class Paneel extends JPanel {
    private static final long serialVersionUID = 1L;

    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JTextField textfield1;
    private JTextField textfield2;
    private JTextField textfield3;
    private JTextField textfield4;

    public Paneel() {
        button1 = new JButton("Home");
        button2 = new JButton("Movies");
        button3 = new JButton("Actors");
        button4 = new JButton("Directors");
        add(button1);
        add(button2);
        add(button3);
        add(button4);

        
    }
}