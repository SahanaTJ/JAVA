package com.xworkz.meven.things;

import org.springframework.stereotype.Component;

@Component
public class Bus {
	public Bus() {
		System.out.println("Bus is running");
	}

	@Override
	public String toString() {
		System.out.println("running to string");
		return "Bus";
	}
	

}
