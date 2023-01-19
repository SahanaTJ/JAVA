package com.xworkz.hospitalapp.hospital;

public class Patient {

	public String patientName;
	public String address;
	public Gender  gender;
	public int age;
	public String Patient1;
	public String Patient2;
	public String Patient3;
	public String Patient4;
	public String Patient5;
	public Patient( ) {
    System.out.println("Patient object is Created");
		this.patientName = patientName;
		this.address=address;
		this.gender=gender;
		this.age=age;
	}
	public void displayInfo() {
		System.out.println("Patient Name is: " + patientName);
		System.out.println("Patient Address is: " + address);
		System.out.println("Patient Gender is: " + gender);
		System.out.println("Patient Age is: " + age);
	}
	public String getGender() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getPatientName() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getAge() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setPatientName(String next) {
		// TODO Auto-generated method stub
		
	}
	public void setAge(int nextInt) {
		// TODO Auto-generated method stub
		
	}
	public void setAddress(String next) {
		// TODO Auto-generated method stub
		
	}
	public void setGender(Gender valueOf) {
		// TODO Auto-generated method stub
		
	}
}