/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.avans.movieproject.domain;

import java.sql.Date;

/**
 *
 * @author rodneygeerlings
 */
public class Movie {

    private int movieID;
    private String title;
    private Date releaseDate;
    private int rating;

    public Movie(int movieID, String title, Date releaseDate, int rating) {
        this.movieID = movieID;
        this.title = title;
        this.releaseDate = releaseDate;
        this.rating = rating;

    }

 

    // Get information
    public int getMovieID() {
        return movieID;

    }

    public String getTitle() {
        return title;

    }

    public Date getReleaseDate() {
        return releaseDate;

    }

    public int getRating() {
        return rating;

    }


    //  Place information
    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }



}
