package com.java.util.scanner;

import java.lang.reflect.Array;

public class MergeArray {
  
	public static void main(String args[]) {
		
		int[] firstArray= {23,45,12,78,4,90,1};
		int[] secondArray= {77,11,45,88,32,56,3};
		int[] length;
		int secondArraylength;
		int sal=secondArraylength;
		int fal;
		int[] result = new int[fal+sal];
		System.arraycopy(firstArray,0,result,0,fal);
		System.arraycopy(secondArray, 0, result, fal, sal);
		System.out.println(Array.toString(result));
	}
}
