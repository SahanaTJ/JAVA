package com.xworkz.meven.things;

import org.springframework.stereotype.Component;

@Component
public class City {
	public City() {
		System.out.println("City is running");
	}

	@Override
	public String toString() {
		System.out.println("running to string");
		return "City";
	}
}
