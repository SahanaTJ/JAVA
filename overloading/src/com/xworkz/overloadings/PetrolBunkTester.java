package com.xworkz.overloadings;

public class PetrolBunkTester {
  
	public static void main(String args[]) {
		
	String workersName[] = {"Akash","Sumanth","Sushma","Navya","Sagar","Sandeep","Sujan"};
	PetrolBunk  bunk = new PetrolBunk(123,"DeveGowda Petrol Bunk","Banshankari 2nd stage",workersName);
	System.out.println(bunk.id + " "+ bunk.name);
	
	PetrolBunk bunk2 = new PetrolBunk(workersName);
	bunk2.displayDetails();
	}
}


// instance method overloading , constructor method overloading