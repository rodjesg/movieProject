package edu.avans.movieproject.presentation;

import javax.swing.*;


class ActorsPanel extends BasePanel {

    private JButton createButton, editButton;
    private JLabel peopleIDText, firstNameText, middleNameText, lastNameText, dateBirthText, cityBirthText, countryBirthText;
    private JTextField peopleID, firstName, middleName, lastName, dateBirth, cityBirth, countryBirth;

    ActorsPanel(OverviewGUI.MainFrame frame) {
        super("Actors menu", frame);

        peopleIDText = new JLabel("People ID");
        peopleID    = new JTextField();
        firstNameText = new JLabel("Firstname");
        firstName   = new JTextField();
        middleNameText = new JLabel("Middlename");
        middleName    = new JTextField();
        lastNameText = new JLabel("Lastname");
        lastName    = new JTextField();
        dateBirthText = new JLabel("Date of Birth");
        dateBirth   = new JTextField();
        cityBirthText = new JLabel("City of Birth");
        cityBirth    = new JTextField();
        countryBirthText = new JLabel("Country of Birth");
        countryBirth    = new JTextField();

        createButton = new JButton("Create");
        createButton.setBounds(0, 600, 100, 100);
        editButton = new JButton( "Edit");
        editButton.setBounds(0, 650, 100, 100);

        /* Adding textlabels and textfields to the screen. */
        add(peopleIDText);
        add(peopleID);
        add(firstNameText);
        add(firstName);
        add(middleNameText);
        add(middleName);
        add(lastNameText);
        add(lastName);
        add(dateBirthText);
        add(dateBirth);
        add(cityBirthText);
        add(cityBirth);
        add(countryBirthText);
        add(countryBirth);

        /* Adding buttons to the screen. */
        add(createButton);
        add(editButton);


    }



}