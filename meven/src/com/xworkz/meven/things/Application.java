package com.xworkz.meven.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Application {
	@Value("Whatsapp")
	String name;
	@Value("Windows")
	String OS;
	
	public Application() {
		System.out.println("Application is running");
	}
	
	

	public Application(String name, String oS) {
		super();
		this.name = name;
		OS = oS;
	}



	@Override
	public String toString() {
		System.out.println("running to string");
		return "Application";
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getOS() {
		return OS;
	}



	public void setOS(String oS) {
		OS = oS;
	}
}
