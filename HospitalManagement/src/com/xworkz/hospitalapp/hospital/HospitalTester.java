package com.xworkz.hospitalapp.hospital;

public class HospitalTester {
  
	public static void main(String args[]) {
		
		Patient patient = new Patient("Manjula","Rajajingara","Gender.female",22) ;
		Hospital hospital = new Hospital();
		hospital.isEmergency= true;
		hospital.isTreatmentRequried=true;
		hospital.admit(patient);
		
		Patient patientt = new Patient("Geetha","Rajajinagara","Gender.female",21);
		Hospital hospital2 = new Hospital();
		hospital2.isEmergency=false;
		hospital2.isTreatmentRequried=true;
		hospital2.admit(patientt);
	}
}
