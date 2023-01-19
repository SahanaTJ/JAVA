package com.xworkz.hospitalapp ;

import com.xworkz.hospitalapp.hospital.Hospital;

public class HospitalTester {

	
		public static void main(String args[]) {
			
			Hospital ref =new Hospital();
			ref.savePatientNames("ganesha");
			ref.savePatientNames("ramya");
			ref.savePatientNames("pooja");
			ref.savePatientNames("sangeetha");
			ref.savePatientNames("raju");
			ref.savePatientNames("monisha");
			ref.savePatientNames("guna");
			
			ref.getPatientNames();
			
			ref.updatePatientNames("guna","guna sarkar");
		
		}
	}
 
