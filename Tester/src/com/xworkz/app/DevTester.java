package com.xworkz.app;

public class DevTester {

	public static <Ginger> void main(String[] args) {
		
		System.out.println("main method started.......");
		Ginger ginger = null;
		/*
		 * try{
		 * 
		 * }catch(){
		 * 
		 * }
		 * 	
		 * 	 */
		
		try {
		String op ="9EADR0";
		System.out.println(Long.parseLong(op));
	}catch(IllegalArgumentException e) {
		
		System.out.println("Contact number is invalid");
		
	}
		System.out.println("main method ended......");
	}
 }


//try is keyword
//catch called as user defined
//catch 2 types 1.default 2.user Defined

//Is try solution for exception handling