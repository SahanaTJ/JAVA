package com.xworkz.meven.things;

import org.springframework.stereotype.Component;

@Component
public class Fish {
	public Fish() {
		System.out.println("Fish is running");
	}

	@Override
	public String toString() {
		System.out.println("running to string");
		return "Fish";
	}
}
