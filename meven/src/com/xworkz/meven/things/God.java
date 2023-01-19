package com.xworkz.meven.things;

import org.springframework.stereotype.Component;

@Component
public class God {
	public God() {
		System.out.println("God is running");
	}

	@Override
	public String toString() {
		System.out.println("running to string");
		return "God";
	}
}
