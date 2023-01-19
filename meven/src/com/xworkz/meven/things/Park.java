package com.xworkz.meven.things;

import org.springframework.stereotype.Component;

@Component
public class Park {
	public Park() {
		System.out.println("Park is running");
	}

	@Override
	public String toString() {
		System.out.println("running to string");
		return "Park";
	}
}
