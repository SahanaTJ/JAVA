package com.xworkz.collection.om;

public class GameRunner {
 
	public static void main(String args[]) {
		
		GameDTO gameDTO1 = new GameDTO("Kabadi","Indoor",7);
		GameDTO gameDTO2 = new GameDTO("Chowkabara","Indoor",4);
		GameDTO gameDTO3 = new GameDTO("Kabadi",null,0);
		
		boolean equals = gameDTO1.equals(gameDTO2);
		System.out.println(equals);
		
	}
}
