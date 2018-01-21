/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.avans.movieproject.domain;

import java.util.Date;
import java.util.List;

/**
 *
 * @author rgeerlings
 */
public class People {

    private int peopleID;
    private String firstName;
    private String middleName;
    private String lastName;
    private Date dateBirth;
    private String cityBirth;
    private String countryBirth;

    public People(int peopleID, String firstName, String middleName, String lastName, Date dateBirth, String cityBirth, String countryBirth) {
        this.peopleID = peopleID;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dateBirth = dateBirth;
        this.cityBirth = cityBirth;
        this.countryBirth = countryBirth;

    }

    // Get information
    public int getPeopleID() {
        return peopleID;

    }

    public String getFirstName() {
        return firstName;

    }

    public String getMiddleName() {
        return middleName;

    }

    public String getLastName() {
        return lastName;

    }

    public Date getDateBirth() {
        return dateBirth;

    }
    public String getCityBirth() {
        return cityBirth;

    }

    public String getCountryBirth() {
        return countryBirth;

    }
    //  Place information

    public void setPeopleID(int peopleID) {
        this.peopleID = peopleID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public void setCityBirth(String cityBirth) {
        this.cityBirth = cityBirth;
    }

    public void setCountryBirth(String countryBirth) {
        this.countryBirth = countryBirth;
    }

}
