package com.xworkz.encapsulationapp.encapsulationclass;

public class BagsTester {

public static void main(String args[]) {
		
	BagsDTO bg = new BagsDTO();
	bg.setSize(10);
	bg.setName("Skybags");
	bg.setBrand("bgss");
	bg.setColor("blue");
		
		System.out.println(bg.getSize());
		System.out.println(bg.getName());
		System.out.println(bg.getBrand());
		System.out.println(bg.getColor());
		}
	}

