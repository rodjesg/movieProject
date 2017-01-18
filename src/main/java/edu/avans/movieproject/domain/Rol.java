/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.avans.movieproject.domain;

/**
 *
 * @author rgeerlings
 */
public class Rol {

    private int rolID;
    private String rolName;
    private String description;

    public Rol(int rolID, String rolName, String description) {
        this.rolID = rolID;
        this.rolName = rolName;
        this.description = description;

    }

    // Get information
    public int getRolID() {
        return rolID;

    }

    public String getRolName() {
        return rolName;

    }

    public String getDescription() {
        return description;

    }

    //  Place information
    public void setRolID(int rolID) {
        this.rolID = rolID;
    }

    public void setRolName(String rolName) {
        this.rolName = rolName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
