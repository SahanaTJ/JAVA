package com.xworkz.components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Rocket {
	@Value("India")
	String country;
	@Value("PSLV")
	String name;
	@Value("8296811622")
	double price;

	public Rocket() {
		System.out.println("Rocket no-argument Constractors....");
	}

	public Rocket(String country, String name, double price) {

		this.country = country;
		this.name = name;
		this.price = price;
		toString();
	}

	@Override
	public String toString() {
		return "Rocket [country=" + country + ", name=" + name + ", price=" + price + "]";
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
