package com.xworkz.overloading.conceptoverloading;

public class CarromBoard {
   
	public String name;
	public String color;
	public String price;
	public String brandName[] = new String[7];
 
	public CarromBoard () {
		System.out.println("Default Constructor is called");
	}
	
	public CarromBoard(String brandName[]) {
	this("Synco","White", "2500",brandName);
	System.out.println("one parameterized consructor is called");
	}
	
	public CarromBoard(String name,String color, String price,String[] brandName)
	{
	
	this();
	System.out.println("Calling 4 Parameterized Constructor");
	this.name =name;
	this.color = color;
	this.price= price;
    this.brandName = brandName;
	}
	public void provideBoards( ) {
	}
	public void displayDetails() {  
		System.out.println("displayDetails() is invoked");
		System.out.println(this.name+" "+this.color+" "+this.price);
		System.out.println("List of Boards for "+ this.name);
		for(int i=0; i<brandName.length;i++) {
			System.out.println(brandName[i]);   
		}
	  }
	}


