package com.xworkz.stringprogram;

import java.lang.reflect.Array;
import java.util.Scanner;

public class TwoFunction {
  
	public static int getLargest(int[]a, int total) {
		Scanner sc = new Scanner(System.in);
		Array.sort(a);
		return a[total-1];
		
	}
	
}
