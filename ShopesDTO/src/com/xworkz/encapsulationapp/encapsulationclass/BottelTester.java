package com.xworkz.encapsulationapp.encapsulationclass;

public class BottelTester {
   
	public static void main(String args[]) {
		
		BottelDTO btl = new BottelDTO();
		btl.setSize(10);
		btl.setName("Bisleri");
		btl.setColor("blue");
				
				System.out.println(btl.getSize());
				System.out.println(btl.getName());
				System.out.println(btl.getColor());
				}
			}


