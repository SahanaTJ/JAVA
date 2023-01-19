package com.xworkz.overloading.conceptoverloading;

import com.xworkz.overloadings.PetrolBunk;

public class CarromBoardTester {
   
	public static void main(String args[]) {
		
	String brandName[] = {"Synco","Precise","Scrco","Vinex","Suzuki","Siscaa","Ubar"};
	CarromBoard  board = new CarromBoard("Synco","White","2500",brandName);
	System.out.println(board.name+ " "+ board.color);
		
	CarromBoard board2 = new CarromBoard(brandName);
	board2.displayDetails();
		}
	}


