package com.xworkz.overloading.conceptoverloading;

public class MarketTester {
 
	public static void main(String args[]) {
		String vegetableNames[] = {"Tamoto","Onion","Beans","Carrot","Betrott","Soppu","potaty","Raddis"};
		Market  ref = new Market("LuluHyperMarket","RajajiNagar",vegetableNames);
		System.out.println(ref.name+ " "+ ref.location);
			
		Market ref2 = new Market(vegetableNames);
		ref2.displayDetails();
			}
		}
	
//inbilt
//
 