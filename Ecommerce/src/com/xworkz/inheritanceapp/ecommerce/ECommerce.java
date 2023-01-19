package com.xworkz.inheritanceapp.ecommerce;

public class ECommerce {
     
	public String name;
	public String purchase;
	
	public void shopping(String purchase) {
		
		System.out.println("The purchased Item is "+ purchase);
		this.purchase = purchase;
		
	}
	   public void presenting(String eCommerce,ECommerce toSister) {
       System.out.println("Presenting the purchase items");
       //purchase(eCommerce);
       toSister.shopping(eCommerce);
       System.out.println("Presenting the Gift...Sister to Happy");
	   }
}