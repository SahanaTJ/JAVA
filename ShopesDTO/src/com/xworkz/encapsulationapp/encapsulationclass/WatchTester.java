package com.xworkz.encapsulationapp.encapsulationclass;

public class WatchTester {

	public static void main(String args[]) {
		
		WatchDTO wh = new WatchDTO();
		wh.setSize(5);
		wh.setName("Titanic");
		wh.setBrand("smart");
		wh.setColor("black");
		
		System.out.println(wh.getSize());
		System.out.println(wh.getName());
		System.out.println(wh.getBrand());
		System.out.println(wh.getColor());
		}
	}
