package com.xworkz.airport;


public class FootwearTester {
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		Footwear ref = new Footwear("HGR56","gray","350","panasonic");  // object creation
		
		System.out.println(ref.Id +" "+ ref.color +" "+ ref.price+" "+ ref.brandName);

	
		Footwear ref1 = new Footwear("HGR56","gray","350","panasonic"); 
		
		System.out.println(ref1.Id +" "+ ref1.color +" "+ ref1.price +" "+ ref1.brandName);
	
}

}
