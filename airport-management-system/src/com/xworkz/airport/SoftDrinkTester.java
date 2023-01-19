//Standard package
package com.xworkz.airport;

public class SoftDrinkTester {
    
	public static void main(String[] args) {
		
		
		SoftDrink.color = "yellow";
		SoftDrink.name ="mango";
		SoftDrink.price = "200";
		SoftDrink.flavor ="mango flavor";
		SoftDrink.quantity ="high";
		
		
		SoftDrink softDrink = new SoftDrink("yellow","mango","200","mango flavor","high");
		
		
		 System.out.println(softDrink.color +" "+ softDrink.name+" "+softDrink.price+" "+softDrink.flavor+" "+softDrink.quantity);

		 SoftDrink softDrink1 = new SoftDrink("Black","grapes","500","grapes flavor","high");
		 System.out.println(softDrink1.color +" "+ softDrink1.name+" "+softDrink1.price+" "+softDrink1.flavor+" "+softDrink1.quantity);
			
}
}

