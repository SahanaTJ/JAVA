package com.xworkz.inheritanceapp.exam;

public class Exam {
                                     
	//Exam has Hallto=icket
	//eg:has-A-relatonship(associated one class other class
	public HallTicket hallTicket;
	public int fees;
	
	public  boolean allow(HallTicket hallTicket) {
		boolean isAllowed = false;
		System.out.println("Inside allow method");
		System.out.println("The fees paid is : " + this.fees);
	   if(fees>=1200) {
		   System.out.println("Fess is paid");
		   if(hallTicket!= null) {
		   this.hallTicket = hallTicket;
		   System.out.println("Details of candidate HallTicket are...");
		   this.hallTicket.displayDetails();
		   isAllowed=true;
		   System.out.println("HallTicket is been issued: now you are ready to exam ");
		    }
	
      else {
    	  System.out.println(" No HallTicket  are found");
      }
	   }
		   else {
		   System.out.println("First pay the Fees");
		   
	   
	return isAllowed;
	}
	return isAllowed;
	}
}
