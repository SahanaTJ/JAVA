package com.xworkz.encapsulationapp.encapsulationclass;

public class MobileTester {


	public static void main(String args[]) {
		
		MobileDTO mb = new MobileDTO();
		mb.setSize(5);
		mb.setName("REdmi");
		mb.setBrand("Mi");
		mb.setColor("Silver");
		
		System.out.println(mb.getSize());
		System.out.println(mb.getName());
		System.out.println(mb.getBrand());
		System.out.println(mb.getColor());
		}
	}
