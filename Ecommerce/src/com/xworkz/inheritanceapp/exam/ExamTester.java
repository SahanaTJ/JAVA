package com.xworkz.inheritanceapp.exam;

public class ExamTester {

	public static void main(String args[]) {
		
		String subjectName[]= {"C++","OS","Artificial Inteligence","DBMS"};
		HallTicket hallTicket = new HallTicket("Manga",subjectName,"4GE19CS428","dabba vtu") ;
		
		Exam exam = new Exam();
		exam.fees = 1200;
		exam.allow(hallTicket);
		boolean isAllowed = exam.allow(hallTicket);
		System.out.println("Allowded to write an exam " + isAllowed);
		
		System.out.println("Going with supplementary Exam");
		Exam exam1 = new SupplementaryExam(2);
		exam1.fees = 150;
		exam1.allow(hallTicket);
		}
	}

//CoffeeShop---  add sop
//       intialize variables
//     boolean  filter(String coffeePowder,String isWaterPresent,boolean isSugarAdded){
//     boolean isFiltered = false;
//     isWaterPresent,boolean isSuagarAdded){
//               check wheather filter is connected or not
//               check if coffeepowder is available or not
//               
//          isFiltered= true;
