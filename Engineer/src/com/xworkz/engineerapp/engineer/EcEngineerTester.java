package com.xworkz.engineerapp.engineer;

public class EcEngineerTester {
  
	public static void main(String args[]) {
		
		Engineer engineer = new EcEngineer();
		//engineer.buildSoftware();
		EcEngineer ecEngineer =(EcEngineer) engineer;
		
		//EcEngineer ecEnginner = new EcEngineer();
		//ecEngineer.solveProblems();
		ecEngineer.buildSoftware();
	}
}
