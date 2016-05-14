package com.rob.movies;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
@Table(name="movies")
public class Movie {

	 @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private int id;
	    
	    private String title;
	    
	    private String description;
	    
	    private String director;
	    
	    private String country;
	    
	    private int year;
	    
	    private double budget;
	    
	    private double rentalPrice;
	    
	    private String onLoan;
	    
	    private String picture;

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	   public String getTitle(){
		   return title;
	   }
	   
	   public void setTitle(String title){
		   this.title = title;
	   }
	   
	   public String getDescription(){
		   return description;
	   }
	   
	   public void setDescription(String description){
		   this.description = description;
	   }
	   
	   public String getDirector(){
		   return director;
	   }
	   
	   public void setDirector(String director){
		   this.director = director;
	   }
	   
	   public String getCountry(){
		   return country;
	   }
	   
	   public void setCountry(String country){
		   this.country = country;
	   }
	   
	   public int getYear(){
		   return year;
	   }
	   
	   public void setYear(int year){
		   this.year = year;
	   }
	   
	   public double getBudget(){
		   return budget;
	   }
	   
	   public void setBudget(double budget){
		   this.budget = budget;
	   }

	   public double getRentalPrice(){
		   return rentalPrice;
	   }
	   
	   public void setRentalPrice(double rentalPrice){
		   this.rentalPrice = rentalPrice;
	   }
	   
	   public String getOnLoan(){
		   return onLoan;
	   }
	   
	   public void setOnLoan(String onLoan){
		   this.onLoan = onLoan;
	   }
	   
	   public String getPicture(){
		   return picture;
	   }
	   
	   public void setPicture(String picture){
		   this.picture = picture;
	   }
	   
}
