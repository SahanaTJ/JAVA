package com.xworkz.encapsulationapp.encapsulationclass;

public class ShopesTester {
 
	public static void main(String args[]) {
		
	ShopesDTO sh = new ShopesDTO();
	sh.setSize(8);
	sh.setName("heela");
	sh.setBrand("bata");
	
	System.out.println(sh.getSize());
	System.out.println(sh.getName());
	System.out.println(sh.getBrand());
	}
}
