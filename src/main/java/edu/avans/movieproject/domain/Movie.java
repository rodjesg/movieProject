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

    
     public int getPeopleID (){
     return peopleID;
     
 }
 
 //  Place information
 
 
 public void setTitle(String title){
     this.title = title;
 }
 
 public void setMovieID (int movieID){
     this.movieID = movieID;
 }
 
  public void setDescription(int peopleID){
     this.peopleID = peopleID;
 }
 
   public void setRating(String rating){
     this.rating = rating;
 }
 
  public void setRolID(int rolID){
     this.rolID = rolID;
 }
  
   public void setPeopleID(int peopleID){
     this.peopleID = peopleID;
 }
 
}
