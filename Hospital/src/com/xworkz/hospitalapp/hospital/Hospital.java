package com.xworkz.hospitalapp.hospital;

public class Hospital {
	
	 //String ptientNames[]={null,null,null,null,null}
     //datatype variableName[] = {value};
	//Datatype variableName[]= new datatype[size];
	
	String patientNames[] = new String[6];
	int index;
	
	
	public boolean savePatientNames(String patientName) {
		System.out.println("Inside savePatientNames");
		if(patientName != null && patientNames.length>index) {
			//patientNames[0]="";
			patientNames[index++]=patientName;
			return true ;
			}
		else {
			System.out.println("patient Name is full... bed illa");
		}
		System.out.println("End of savePatientNames");
            return false ;
	}
		public void getPatientNames() {
			System.out.println("List of all patient names");
			for(int i=0;i<patientNames.length;i++) {
				System.out.println(patientNames[i]);
				
				}
			}
		public boolean updatePatientNames(String oldPatientName,String newPatientName)
		{
			System.out.println("Inside updatePatientNames");
			for(int i=0;i<patientNames.length;i++) {
				if(patientNames[i]==oldPatientName) {
					patientNames[i]=newPatientName;
				return true;	
				}
				else {
					//you have to one negative message
				}
			}
			return false;
		}
	}

