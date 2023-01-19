package com.xworkz.meven.things;

import org.springframework.stereotype.Component;

@Component
public class Temple {
	public Temple() {
		System.out.println("Temple is running");
	}

	@Override
	public String toString() {
		System.out.println("running to string");
		return "Temple";
	}
}
