package com.xworkz.springframework.components.configuration;

import org.springframework.stereotype.Component;

@Component
public class Sahana {
	public Sahana() {
		System.out.println("Sahana ");
	}

	@Override
	public String toString() {
		System.out.println("running to string");
		return "sana";
	}
}
