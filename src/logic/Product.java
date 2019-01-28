/*
Name: Team 3
Date: 29 - 04 -18
This class represents products that can be added to the vending machines
*/
package logic;

import java.util.*;
import java.io.*;

public class Product implements Serializable{
	
	//Attributes
	private String name;
	private String description;
	private int available;
	private int cost;
	
	public Product(String name, String description, int available, int cost){
		this.name = name;
		this.description=description;
		this.available=available;
		this.cost=cost;
	}
	// Setters and getters
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return this.description;
	}
	
	public void setAvailable(int available){
		this.available = available;
	}
	
	public int getAvailable(){
		return this.available;
	}

	public void setCost(int cost){
		this.cost = cost;
	}

	public int getCost(){
		return this.cost;
	}
	
}