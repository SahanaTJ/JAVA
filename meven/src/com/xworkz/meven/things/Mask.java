package com.xworkz.meven.things;

import org.springframework.stereotype.Component;

@Component
public class Mask {
	public Mask() {
		System.out.println("Mask is running");
	}

	@Override
	public String toString() {
		System.out.println("running to string");
		return "Mask";
	}
	
}
