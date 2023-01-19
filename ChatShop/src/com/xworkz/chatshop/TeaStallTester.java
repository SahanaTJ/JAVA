package com.xworkz.chatshop;

public class TeaStallTester {
   
	 public static void main(String[] args) {
		
	    TeaStall ref = new TeaStall();   //default constructor
		System.out.println(ref.name +" "+ ref.teaStallid+" "+ ref.ownerName);
		ref.name ="Chaiwala";
		ref.teaStallid = 123;
		System.out.println(ref.name +" "+ ref.teaStallid);
		
		TeaStall ref1 = new TeaStall(123,"Chaiwala","Akash");  //parameterized constuctor
	    System.out.println(ref1.name+" "+ref1.teaStallid+" "+ref1.ownerName);
	    
	   
	}
}