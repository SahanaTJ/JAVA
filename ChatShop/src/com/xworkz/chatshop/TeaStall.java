package com.xworkz.chatshop;

public class TeaStall {
   
	public int teaStallid;
	public String name;
	public String ownerName;
	
	public TeaStall() {  //default constructor
	}
	public TeaStall(int id,String name,String ownerName) {    //parameraized 
		//wrt id,using this is optional
		this.teaStallid = teaStallid;
		//wrt name, ownerName,
		//this keyword is to avoid naming conflict b/w the parameter
		this.name = name;
		this.ownerName = ownerName;
		//invokong display info method in a constructor using this keyword
		this.displayInfo();
	}
	public  void displayInfo() {
		//invoking variables of a current class using this keyword
		System.out.println(this.name+" "+this.teaStallid+" "+this.ownerName);
		}
	
}
      // this. is a keyword  using towards
    //member can be variable and method