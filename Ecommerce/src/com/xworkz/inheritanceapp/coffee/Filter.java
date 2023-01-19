package com.xworkz.inheritanceapp.coffee;

public class Filter {

	private String CoffeePowder;
	private String isWaterPresent[];
	private boolean isSugarAdded;
	private int  price;
	
	
	
	public boolean filter(String coffeePowder,String isWaterPresent,boolean isSugarAdded){
	this.CoffeePowder = CoffeePowder;
	this.isWaterPresent = isWaterPresent;
	this.isSugarAdded=isSugarAdded;
	this.price=price;
	
	}
	public void displayDetails(){

		System.out.println("CoffeePowder Names  :" + this.CoffeePowder);
		System.out.println("isWaterPresent Names :" +this.isWaterPresent);
		System.out.println("isSugarAdded is :" +this.isSugarAdded);
		System.out.println("price are : "+this.price);
		
		
		for(int z=0;z<isWaterPresent.length;z++) {
			System.out.println(isWaterPresent[z]);
		}
		
	}
}

