package com.java.util.scanner;

import java.util.Scanner; //reverse all string or word

public class ReverseStringGood {
  
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the reverse the string");
		String s=sc.nextLine();
		
		//Object s;
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print("" +s.charAt(i));
		}
	}
}
