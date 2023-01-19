package com.xworkz.overloading.conceptoverloading;

public class Market {
   
	public String name;
	public String location;
	public String [] vegetableNames = new String[8];
	
	public Market() {
	System.out.println("Default Constructor is called");
	}
	public Market(String vegetablesNames[]) {
		this("LuluHyperMarket","RajajiNagar",vegetablesNames);
		System.out.println("one parameterized consructor is called");
		}
		
		public Market(String name,String location, String[] vegetablesNames)
		{
		
		this();
		System.out.println("Calling 3 Parameterized Constructor");
		this.name =name;
		this.location = location ;
	    this.vegetableNames = vegetablesNames;
		}
		public void provideVegetables() {
		}
		public void displayDetails() {  
			System.out.println("displayDetails() is invoked");
			System.out.println(this.name+" "+this.location);
			System.out.println("List of vegetables for "+ this.name);
			for(int v=0; v<vegetableNames.length;v++) {
				System.out.println(vegetableNames[v]);   
			}
		  }
		}


