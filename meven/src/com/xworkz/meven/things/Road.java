package com.xworkz.meven.things;

import org.springframework.stereotype.Component;

@Component
public class Road {
	public Road() {
		System.out.println("Road is running");
	}

	@Override
	public String toString() {
		System.out.println("running to string");
		return "Road";
	}
	

}

