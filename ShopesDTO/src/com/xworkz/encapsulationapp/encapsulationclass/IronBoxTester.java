package com.xworkz.encapsulationapp.encapsulationclass;

public class IronBoxTester {
  
public static void main(String args[]) {
		
	IronBoxDTO irnb = new IronBoxDTO();
	irnb.setSize(10);
	irnb.setName("philips");
	irnb.setBrand("philips");
	irnb.setColor("white");
				
		System.out.println(irnb.getSize());
		System.out.println(irnb.getName());
		System.out.println(irnb.getBrand());
		System.out.println(irnb.getColor());
	}
}


