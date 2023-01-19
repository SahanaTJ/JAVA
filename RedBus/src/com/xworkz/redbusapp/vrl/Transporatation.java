package com.xworkz.redbusapp.vrl;

public class Transporatation {
  
	 RedBusContract redbusContract  ;
	 
	 int noOfBookings;
		
	    String name = "Sri Durga parameshawari";
	
	   public boolean bookings(RedBusContract contract) {
		   boolean isBookingDone = false;
		   System.out.println("Inside bookings method");
		   boolean condition = contract.conditionbOfBus();
		   if(condition==true) {
			   System.out.println("Bus is in good condition");
			   if(noOfBookings <=contract.minBookings()) {
				   System.out.println("No of Bookings is " + noOfBookings);
				   System.out.println("Thank you for Booking the ticket through "+ name);
			   }
			   else {
				   System.out.println("Cannot procced with Bookings as noOfBookings Exceeds");
			   }
		   }
		   else {
			   System.out.println("Cannot processed with booking as bus is not in good Condition");
		   }
		   return isBookingDone;
			   
		      
		
		  // logic
	   }

}

