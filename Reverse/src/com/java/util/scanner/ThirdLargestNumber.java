package com.java.util.scanner;

public class ThirdLargestNumber {
   
	public static void main(String args[]) {
		int temp,size;
		int array[] = {59, 20, 13, 6, 7};  //decending swapping //array index value start 0
		//size = array.length;
		for(int i=0;i<array.length;i++) { //array travesal
		for(int j=i+1;j<array.length;j++) {
				if(array[i]<array[j]) {
					temp = array[i];
					array[i]= array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println("Third Largest Number is:" +array[3]);
	}
}

