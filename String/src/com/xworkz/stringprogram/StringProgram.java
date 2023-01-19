package com.xworkz.stringprogram;

public class StringProgram {
    
	public static void main(String args[]) {
		
		//reverse a string
		String name ="Java Programming";
		System.out.println(name);
		
		//in built
		for(int i=0;i<name.length();i++) {
			System.out.print(" "+name.charAt(i));
		}
		System.out.println("   String reverse");
		for(int i=name.length()-1;i>=0;i--) {
			System.out.print(" "+name.charAt(i));
			}
		//counting a given char
		int count=0;
		int count1=0;
		int count2=0;
	
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)=='a') {
		
				count+=1;
			
			} else {
		count1+=1;
		}
	
           System.out.println("count:"+count);
           System.out.println("count1:"+count1);
           
           String str ="Good Learing";
           for(char ch:str.toCharArray()) {
        	   if(ch=='o') {
        		   count2+=1;
        	   }
        	   System.out.print(ch+" ");
           }
           System.out.println("count:"+count2);
	
	 
	         String names="madam";
	         String reverse="";
	         for(int i1=names.length()-1;i1>=0;i1--) {
	        	 
	        reverse+=names.charAt(i1);
	       }
	       if(names.equals(reverse)) {
	    	   System.out.println("matched");
	       }else {
	    	  System.out.println("not matched");
	    	
	    	  
	      }
	 }
}

}
