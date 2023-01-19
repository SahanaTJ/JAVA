package com.xworkz.meven.things;

import org.springframework.stereotype.Component;

@Component
public class Patient {
	public Patient() {
		System.out.println("Patient is running");
	}

	@Override
	public String toString() {
		System.out.println("running to string");
		return "Patient";
	}
	
}
