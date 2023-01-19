package com.xworkz.meven.things;

import org.springframework.stereotype.Component;

@Component
public class Milk {
	public Milk() {
		System.out.println("Milk is running");
	}

	@Override
	public String toString() {
		System.out.println("running to string");
		return "Milk";
	}
	
}
