package com.google.collection;

import com.sun.java_cup.internal.runtime.Scanner;

public class IndexOf {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
			
		System.out.println("Enter the required String...");
		String str = sc.next;
		System.out.println("Enter the required character...");
		String ch;
		int i = str.indexOf(ch);
		if(i!=-1) {
			System.out.println("String contains the specified character");
		}else {
			System.out.println("String doesn't contain the specified character...");
		}
	}
}
