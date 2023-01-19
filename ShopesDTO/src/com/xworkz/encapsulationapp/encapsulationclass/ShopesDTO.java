package com.xworkz.encapsulationapp.encapsulationclass;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class ShopesDTO {
  
	private int size;
	private String name;
	private String brand;
	
	public void setSize(int size) {
		this.size=size;
	}
	public int getSize() {
		return size;
		}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	}

