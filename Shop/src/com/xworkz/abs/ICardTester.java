package com.xworkz.abs;

public class ICardTester {
  
	public static void main(String args[]) {
		
		ICard card = new SbiBank();
		ICard card1 =  new HdfcBank();
		ICard card2 =new  IciciBank();
		
		Bank bank = new SbiBank();
	}
}
