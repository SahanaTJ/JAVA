package com.xworkz.overloadings;

public class PetrolBunk {
   
	//Instance variables/states/properties/fields
	public int id;
	public String name;
	public String location;
	public String workersName[] = new String[7];
 
	public PetrolBunk() {
		System.out.println("Default Constructor is called");
	}
	//Default Constructor
	public PetrolBunk(String workersName[]) {
	this(123,"DeveGowda Petrol bunk", "banshankari 2nd stage",workersName);
	System.out.println("one parameterized consructor is called");
	}
	
	
	//Parameterized Constructor
	public PetrolBunk(int id, String name, String loaction,String[] workersName)
	{
	
	//Below statement is used for Constructor Chaining;
	this();
	System.out.println("Calling 4 Parameterized Constructor");
	this.id = id;
	this.name =name;
	this.location = location;
	this.workersName = workersName;
	}
	public void provideFuels( ) {
	}
	public void displayDetails() {  //instance method overloading
		System.out.println("displayDetails() is invoked");
		System.out.println(this.id+" "+this.name+" "+this.location);
		System.out.println("List of workers for "+ this.name);
		for(int i=0; i<workersName.length;i++) {
			System.out.println(workersName[i]);   //instance variable
		}
	  }
	}


//difference between this keyword and this method
//Constructor
//types of constructor
//use of cons
//constructor overloading
//constructor chaining

