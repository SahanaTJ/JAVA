package com.xworkz.airport;

public class IronBoxTester {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
	
       
		IronBox ironBox = new IronBox("QW12","white",3500,"philips","high quality") ;
		
	
	 System.out.println(ironBox.Id +" "+ ironBox.color +" "+ ironBox.price+" "+ ironBox.brandName);
	     
	 IronBox ironBox1 = new IronBox("FG45","white",2500,"sonic","high quality") ;

	 System.out.println(ironBox1.Id +" "+ ironBox1.color +" "+ ironBox1.price+" "+ ironBox1.brandName);
     
}
}

