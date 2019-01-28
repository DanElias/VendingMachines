/*
Name: Team 3
Date: 27 - 04 -18
This class represents a user that pays for products
*/
package logic;

import java.util.*;
import java.io.*;

public class User implements Serializable{
	
	//Attributes
	private String name;
	private int money;
	
	public User(String name, int money){
		this.name = name;
		this.money = money;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setMoney(int money){
		this.money = money;
	}
	
	public int getMoney(){
		return this.money;
	}
}
	