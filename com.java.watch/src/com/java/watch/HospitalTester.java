package com.java.watch;

public class HospitalTester {
  
	public static void main(String[] args) {
		
		Hospital hospital = new Hospital();
		hospital.savePatientNames("ganesha");
		hospital.savePatientNames("ramya");
		hospital.savePatientNames("pooja");
		hospital.savePatientNames("sangeetha");
		hospital.savePatientNames("raju");
		
		hospital.getPatientNames();
	}
}
