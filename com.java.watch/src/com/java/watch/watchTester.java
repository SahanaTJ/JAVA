package com.java.watch;


public class watchTester {

	public static void main(String[] args) {
		
        
		Watch.Id = "AD456";
		Watch.color ="Pink";
		Watch.price = "4500";
		Watch.brandName = "firebalt";
		Watch.type = "electronic";
		
       
		Watch watch = new Watch("AD456","Pink","4500","firebalt","electronic");
		
	
		System.out.println(watch.Id +" "+ watch.color +" "+ watch.price+" "+watch.brandName+" "+watch.type);
	   System.out.println("Watch id is " + watch.Id);
	   System.out.println("Watch colo is "+ watch.color);
	   System.out.println("Watch price is "+ watch.price);
	   System.out.println("Watch bName is "+ watch.brandName);
	   System.out.println("Watch type is "+ watch.type);	   
  }
}
