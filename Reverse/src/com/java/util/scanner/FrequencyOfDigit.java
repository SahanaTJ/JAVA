package com.java.util.scanner;

import java.util.Scanner;

   public class FrequencyOfDigit {
  
	   static int frequencyDigits(int n,
               int d) {
		   Scanner sc = new Scanner(System.in);
   // Counter variable to
   // store the frequency
   int c = 0;

    // iterate till number
    // reduces to zero
    while (n > 0){

   // check for equality
   if (n % 10 == d)
   c++;
   // reduce the number
   n = n / 10;
    }
   return c;
 }

    //Driver Code
   public static void main(String args[]){

    // input number N
   int N = 1122322;

    // input digit D
    int D = 2;

     System.out.println(frequencyDigits(N, D));
    }
}
