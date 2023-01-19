package com.xworkz.encapsulationapp.encapsulationclass;

public class LaptopTester {

	public static void main(String args[]) {
		
		LaptopDTO lp = new LaptopDTO();
		lp.setSize(9);
		lp.setName("Laptops");
		lp.setBrand("HP");
		lp.setColor("Silver");
			
			System.out.println(lp.getSize());
			System.out.println(lp.getName());
			System.out.println(lp.getBrand());
			System.out.println(lp);
			}
		}


