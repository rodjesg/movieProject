/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.avans.movieproject.domain;

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
    private String dateBirth;
    private String died;
    private String cityBirth;
    private String countryBirth;
    private int movieID;

   
public Rol( int rolID, String title, String description) {
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
}