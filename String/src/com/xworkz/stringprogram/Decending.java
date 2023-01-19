package com.xworkz.stringprogram;

import java.util.Scanner;

public class Decending {
  
	public static void main(String args[]) {
		int arr[]=new int[] {0,1,2,3,4,5,6,7,8,9};
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int temp=0;
				if(arr[j]>arr[i]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[j]=temp;
				}
			 }
			System.out.println(arr[i]);
				}
			}
		}
	