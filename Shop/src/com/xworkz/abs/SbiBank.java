package com.xworkz.abs;

public class SbiBank extends Bank implements ICard {

	@Override
	public void swipe() {
		System.out.println("Swipping card of sbi bank");
		
	}

}
