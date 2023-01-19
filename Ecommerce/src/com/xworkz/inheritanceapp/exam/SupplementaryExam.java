package com.xworkz.inheritanceapp.exam;

public class SupplementaryExam  extends Exam {
  
	int noOfAttempts;
	public SupplementaryExam(int noOfAttempts) {
		this.noOfAttempts = noOfAttempts;
		}
	@Override
	//@- is a Annotation metadata which is used to give information to the compiler
	public boolean allow(HallTicket hallticket) {
		System.out.println("Invoked allow method of SupplementaryExam");
		if(noOfAttempts>1) {
			return super.allow(hallTicket);
		}
		return false;
		}
	}
