package com.xworkz.airport;

public class Employee {

	public Employee() {
		
	}
  static  public String employeeId ;
  static  public String name;
  static  public String companyName ;
  static  public String companyAddress;
  static  public String bloodGroup;
     
  public Employee(String empId,String nm,String bGroup) {
       System.out.println("Employee object is created");
       employeeId = empId;
       name =nm ;
       bloodGroup = bGroup;
  }
       
         public void  toHelpOrgToGrow () {
    	 System.out.println("naane nanu..........");
     }
}
