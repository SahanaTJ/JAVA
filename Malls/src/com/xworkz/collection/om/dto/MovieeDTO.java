package com.xworkz.collection.om.dto;

public class MovieeDTO {
  
	private String name;
	private String lang;
	private double price;
	
	
	public MovieeDTO() {
		
	}

	public MovieeDTO(String name) {
		super();
		this.name = name;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 30;
	}
	@Override
	public boolean equals(Object obj) {
		
		return false;
	}

	@Override
	public String toString() {
		return "MovieeDTO [name=" + name + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
