package com.xworkz.airport;

public class EmployeeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		// static members are can be shared amoung different /multiple objects
		Employee.companyName = "Amazon";
		Employee.companyAddress ="Maqhendra Tech park";
		
       
		Employee emp = new Employee("AWS234","Amazon","A+");
		
		System.out.println("First Employee") ;
		System.out.println(emp.employeeId +" "+ emp.name +" "+ emp.bloodGroup);
	
		System.out.println("Employee company name is "+Employee.companyName) ;
		System.out.println("Employee  Address is "+ Employee.companyAddress); 


		
		
		
		Employee emp1 = new Employee();
		
		System.out.println("Second Employee") ;
		System.out.println(Employee.companyName) ;
		System.out.println(Employee.companyAddress);
		System.out.println(Employee.name) ;
		System.out.println(Employee.bloodGroup) ;
		
    
		
	}
	}
   
	//instance 
      // static members are can be shared amoung different /multiple objects
      //  instance members can not be shared amoung multiple objects


    //Watch--id,color,price,brandName,type,3 object
    //Footwear--id,size,color,model,branName,
    //IronBox---id,name,type
    //IceCream --color,price
    //SoftDrink--id,name,price,flavor,quantity