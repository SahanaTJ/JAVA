package com.xworkz.inheritanceapp.coffee;


public class CoffeeShop {

	public  String CoffeeNames;
	public int  price;
	
	boolean  filter(CoffeeNames coffeeNames){
		boolean isFiltered = false;
		System.out.println("Inside filter method");
		System.out.println("The filter coffee are : " + this.price);
	   if(price>=120) {
		   System.out.println("Coffee amount pay");
		   if(CoffeeNames!= null) {
		   this.CoffeeNames = CoffeeNames;
		   System.out.println("The Details of Filter coffee ");
		   this.CoffeeNames.displayDetails();
		   isFiltered=true;
		   System.out.println("The Filter Coffee is ready: to drink ");
		    }
	
      else {
    	  System.out.println("The Filter Coffee are found");
      }
	   }
		   else {
		   System.out.println("Drink the filterCoffee");
		   
	   
	return isFiltered;
	}
	return isFiltered;
	}
}

