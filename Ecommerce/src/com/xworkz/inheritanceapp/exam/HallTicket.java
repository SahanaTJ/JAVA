package com.xworkz.inheritanceapp.exam;

public class HallTicket {
   
	private String candidateName;
	private String subjectName[];
	private String usnNo;
	private String universityName;
	
	public HallTicket(String candidateName,String[] subjectName,String usnNo , String universityName) {
	this.candidateName = candidateName;
	this.subjectName = subjectName;
	this.usnNo=usnNo;
	this.universityName = universityName;
	}
	public void displayDetails(){
		//to invoke the correct class member use this:
		System.out.println("Candidate Name :" + this.candidateName);
		System.out.println("UniversityName Name :" +this.universityName);
		System.out.println("USN are :" +this.usnNo);
		
		//"List of Subjects exam to be given by the candidate");
		for(int i=0;i<subjectName.length;i++) {
			System.out.println(subjectName[i]);
		}
		
	}
}
