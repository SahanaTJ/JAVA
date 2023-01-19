package com.xworkz.inheritanceapp.ecommerce;

public class ECommerceTester {
        
	public static void main(String args[]) {
		
		ECommerce eCommerce = new ECommerce();
		eCommerce.shopping("Leather Jacket");
		//eCommercee.shopping("Shoes");
		System.out.println("Thank you for ordering "+ eCommerce.purchase);
		
		ECommerce sister = new ECommerce();
		sister.shopping("Dress");
		
		eCommerce.presenting("Leather Jacket", sister);
		System.out.println("In My Sister hand " + sister.purchase);
		System.out.println("Mother ordering");
		ECommerce motherOrdering = new ECommerce();
		motherOrdering.shopping("Saree");
		
		//eCommerce.shopping("shoes");
		System.out.println("Thank you for ordering " +eCommerce.purchase);
		
		ECommerce sisters = new ECommerce();
		sisters.shopping("Dress");
		
		eCommerce.presenting("Leather Jacket", sister);
		System.out.println("In My sister hand "+ sister.purchase);
		
		System.out.println("Mother ordering");
		ECommerce motherOdering = new ECommerce();
		motherOrdering.shopping("Saree");
		motherOrdering.shopping("Bag");
		System.out.println("Thank you for Ordering " + motherOrdering.purchase);
		
	}
}
            //create ,alter,drop commands are imp for SQL

