package com.xworkz.meven.things;

import org.springframework.stereotype.Component;

@Component
public class Mall {
	public Mall() {
		System.out.println("Mall is running");
	}

	@Override
	public String toString() {
		System.out.println("running to string");
		return "Mall";
	}
}
