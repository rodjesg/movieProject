/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.avans.movieproject.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rodneygeerlings
 */
public class Movie {

    private int movieID;
    private String title;
    private String releaseDate;
    private String rating;
    private int peopleID;
    private int rolID;

    public Movie(int movieID, String title, String releaseDate, String rating, int peopleID, int rolID) {
        this.movieID = movieID;
        this.title = title;
        this.releaseDate = releaseDate;
        this.rating = rating;
        this.rolID = rolID;
        this.peopleID = peopleID;
    }

 

    // Get information
    public int getMovieID() {
        return movieID;

    }

    public String getTitle() {
        return title;

    }

    public String getReleaseDate() {
        return releaseDate;

    }

    public String getRating() {
        return rating;

    }

    public int getRolID() {
        return rolID;

    }

    public int getPeopleID() {
        return peopleID;
    }

    //  Place information
    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setRolID(int rolID) {
        this.rolID = rolID;
    }

    public void setPeopleID(int peopleID) {
        this.peopleID = peopleID;
    }

}
