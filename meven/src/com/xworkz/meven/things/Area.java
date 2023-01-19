package com.xworkz.meven.things;

import org.springframework.stereotype.Component;

@Component
public class Area {
	public Area() {
		System.out.println("Area is running");
	}

	@Override
	public String toString() {
		System.out.println("running to string");
		return "Area";
	}
}
