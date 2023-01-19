package com.xworkz.redbusapp.vrl;

public class RedBusTester {
  
	private static RedBusContract redBusContract;

	public static void min(String args[]) {
		
		RedBusContract busContract = new Vrilmpl();
		
		Transporatation transportation = new Transporatation();
		int noBookings=30;
		transportation.bookings(redBusContract);
	}
}


//grouping data in single unit encapsulation

// the example of compiletime polymorphism is -- method overloading
// the example of runtime poly is --method overriding