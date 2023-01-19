package com.xworkz.meven.things;

import org.springframework.stereotype.Component;

@Component
public class Girl {
	public Girl() {
		System.out.println("Girl is running");
	}

	@Override
	public String toString() {
		System.out.println("running to string");
		return "Girl";
	}
	

}
