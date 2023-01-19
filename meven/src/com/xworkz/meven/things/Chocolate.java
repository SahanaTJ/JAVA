package com.xworkz.meven.things;

import org.springframework.stereotype.Component;

@Component
public class Chocolate {
	public Chocolate() {
		System.out.println("Chocolate is running");
	}

	@Override
	public String toString() {
		System.out.println("running to string");
		return "Chocolate";
	}
}
