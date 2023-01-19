package com.xworkz.engineerapp.engineer;

public class MechEngineerTester {
	  //type Casting

	public static void main(String args[]) {
		
		//polymorphism -- Implicit Casting--up casting
		Engineer engineer = new MechEngineer();
		
		//Explicit Casting---down casting
		 MechEngineer mechEng = ( MechEngineer) engineer;
		 mechEng.designingMachine();
	}
}
