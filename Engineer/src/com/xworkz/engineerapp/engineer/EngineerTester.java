package com.xworkz.engineerapp.engineer;

public class EngineerTester {
  
	  public static void main(String args[]) {
		  
		  //Converting from parent to child--do it explicitly
		  Engineer engineer = new Engineer();
		  
		  //Polumorphism--  //implicit Casting
		  CsEngineer csEnginner = (CsEngineer)engineer;
		  EcEngineer ecEngineer = (EcEngineer)engineer;
		  
		  //
		  MechEngineer mechEngineer = (MechEngineer)engineer;
		
		//Polymorphism
		//1.Compile time polymorphism provides--method overloading
		//2.runtime polymorphism provides--method overriding
		Object object = new Engineer();
		Object object2 = new CsEngineer();
		
		EcEngineer ecEngineer1 = new EcEngineer();
		String message = ecEngineer1.solveProblems();
		
		System.out.println(message);
	}
}

//can we overload static method No
//can we override static method Yes
//can we overload main method yes
//main method as string array


//Casting--coverting to one data type to another datatype
// 2 types ---Implicit and Explicit casting
// polymorphism data is similar for casting


 
// 
