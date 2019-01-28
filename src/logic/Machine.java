/*
Name: Team 3
Date: 27/04/18 - 30/04/18
This class represents a vending machine it creates the products from the Product class
therefore, it uses composition with it. 
*/
package logic;

import java.util.*;
import java.io.*;

public class Machine implements Serializable{
	
	//Attributes
	private User user; 
	private ArrayList<Product> products;
	private ArrayList<Integer> coins;
	
	public Machine(User user, ArrayList<Integer> coins, ArrayList<Product> products ){
		this.coins=coins;
                this.products=products;
                this.user=user;
		this.coins.add(500);// 1st position= total money,
		this.coins.add(20); // 2nd= amount of 5 coins,
		this.coins.add(20); // 3rd= amount of 10 coins,
		this.coins.add(10); // 4th= amount of 20 coins.
                
                // the initial configuration of the product
	 	Product product1 = new Product("Fiji Water", "200ml bottle of pure water", 3, 10);
	 	this.products.add(product1);
	 	Product product2 = new Product("Cafe Ole", "200ml of cool coffee", 10, 15);
	 	this.products.add(product2);
	 	Product product3 = new Product("Aloe Drink", "300ml of natural aloe", 10, 20);
	 	this.products.add(product3);
	 	Product product4 = new Product("Powerade", "300ml of energy drink", 10, 15);
	 	this.products.add(product4);
	 	Product product5 = new Product("Protein Bar", "Nature Valley bar!", 10, 10);
	 	this.products.add(product5);
	 	Product product6 = new Product("Baby Carrots", "Nutritious carrots!", 10, 20);
	 	this.products.add(product6);
	 	Product product7 = new Product("Cookies", "Granola healthy cookies", 10, 15);
	 	this.products.add(product7);
	 	Product product8 = new Product("Vegie Chips", "Less oily, more healthy", 10, 10);
	 	this.products.add(product8);
	 	Product product9 = new Product("Cranberries", "Healthy treats for you!", 10, 25);
	 	this.products.add(product9);		
	}
        
	public void setUser(User user){ //Setters and getters
		this.user = user;
	}
	
	public User getUser(){
		return this.user;
	}
	
	public ArrayList<Product> getProducts(){
		return this.products;
	}
	
	public void setProducts(ArrayList<Product> products){
		this.products = products;
	}
	
	public void setCoins(ArrayList<Integer> coins){
		this.coins = coins;
	}
	
	public ArrayList<Integer> getCoins(){
		return this.coins;
	}
	
	
	/*Este metodo lee el costo del producto
	que este en el array, y si el dinero que 
	el usuario ha introducido es mayor o igual
	regresa true. Si no cubre el costo del producto, regresa false*/
	public boolean validateMoneyIntroduced(int number, int total_introduced){
		if(products.get(number).getCost()<=total_introduced){
			return true;
		} 

		else{
			return false;
		}
	}
        
        // Adds to the machine coins the coins introduced to the machine by the user-
        public void addIntroducedCoins(ArrayList<Integer> introduced_coins){
            coins.set(0, coins.get(0)+introduced_coins.get(0)*5+introduced_coins.get(1)*10+introduced_coins.get(2)*20);
            coins.set(1, coins.get(1)+introduced_coins.get(0));
            coins.set(2, coins.get(2)+introduced_coins.get(1));
            coins.set(3, coins.get(3)+introduced_coins.get(2));
        }
	
	/*Este metodo lee la disponibilidad de un producto
	que este en el array, y si hay mas de uno regresa true.
	Si no hay o no existe, regresa false*/
	public boolean validateAvailability(int number){
            
		if(products.get(number).getAvailable() > 0){
                    return true;
		}
                else{
                    return false;
                }
	}
        
        // reduces the available number of products available

	public void reduceAvailability(int number){
		this.products.get(number).setAvailable((products.get(number).getAvailable()) - 1);
	}
        
        //Calculates the change that needs to be returned to user and the number of each type of coins that should be returned.
	public ArrayList<Integer> getChange(int number, int money_introduced){ // calcula el cambio por pagar al usuario
		ArrayList<Integer> change=new ArrayList<Integer>();
		int num5=0;// monedas de 5 por pagar
		int num10=0; // monedas de 10 por pagar
		int num20=0; // monedas de 20 por pagar
		int sobra20=0; //numero de monedas 20 que no pueden pagar el cambio
		int sobra10=0; //numero de monedas 10 que no pueden pagar el cambio
		int sobra5=0; //numero de monedas 5 que no pueden pagar el cambio
		int acum20=0; // monedas de 20 que han sido ya pagadas
		int acum10=0; // monedas de 10 que han sido ya pagadas
		int acum5=0; // monedas de 5 que han sido ya pagadas
		int porpagar=0; // cantidad restante de cambio por pagar

		porpagar=money_introduced-products.get(number).getCost();
                coins.set(0, coins.get(0)-porpagar);
		change.add(porpagar); //posicion 0
		change.add(acum5);// posicion 1
		change.add(acum10); // posicion 2
		change.add(acum20); // posicion 3

		num20=porpagar/20;
                //System.out.println(num20);

		while(coins.get(3)>0 && num20>0){
			acum20++;
			num20--;
			change.set(3, acum20);
			porpagar=porpagar-20;
                        coins.set(3, coins.get(3)-1); // restar número de monedas de 20 en la máquina
		}

		sobra20=num20 + porpagar%20;
		num10=sobra20/10;

		while(coins.get(2)>0 && num10>0){
			acum10++;
			num10--;
			change.set(2, acum10);
			porpagar=porpagar-10;
                        coins.set(2, coins.get(2)-1); // restar búmero de monedas de 10 en la máquina
		}

		sobra10=num10 + porpagar%10;
		num5=sobra10/5;

		while(coins.get(1)>0 && num5>0){
			acum5++;
			num5--;
			change.set(1, acum5);
			porpagar=porpagar-5;
                        coins.set(1, coins.get(1)-1); // restar número de monedas de 5 en la máquina
		}
                coins.set(0, coins.get(1)*5+coins.get(2)*10+coins.get(3)*20);
                System.out.println(coins.get(0));
                System.out.println(coins.get(1));
                System.out.println(coins.get(2));
                System.out.println(coins.get(3));
                
                setCoins(coins);
                
		return change;
	}
	
        //Adds product
	public void addProductQuantity(int number, int add){
		products.get(number).setAvailable((products.get(number).getAvailable()) + add);
	}

}