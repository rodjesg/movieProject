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
    
public Movie( int movieID, String title, String description) {
     this.rolID = rolID;
     this.title = title;
     this.description = description;
     
 }
 
 // Get information
 
 public int getRolID (){
     return rolID;
     
 }
 public String getTitle (){
     return title;
     
 }
 public String getDescription (){
     return description;
     
 }
 
 //  Place information
 
 public void setRolID(int rolID){
     this.rolID = rolID;
 }
 
 public void setTitle(String title){
     this.title = title;
 }
 
 public void setDescription(String description){
     this.description = description;
 }
 
 
 
}
