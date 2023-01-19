package com.xworkz.hospitalapp.hospital;

public class Hospital {
  
	public Patient patient;
	public boolean isEmergency;
	public boolean isTreatmentRequried;
	
	public boolean admit(Patient patient) {
    boolean isAmditted = false;
    try {
    if(isTreatmentRequried==true) {
    if(isEmergency==true) {
    	this.patient=patient;
    	this.patient.displayInfo();
    	System.out.println("Patient can be allowed in ICU ward");
    }
       else {
    	System.out.println("Admit the patient in general ward");
    }
  }
    
    
   
       else {
    	System.out.println("Treament is not required");
 //   }catch(Exception e) {
    }
    
      return isAmditted;
    }
}
}
