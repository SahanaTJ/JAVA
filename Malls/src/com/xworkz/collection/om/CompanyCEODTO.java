package com.xworkz.collection.om;

import java.io.Serializable;

public class CompanyCEODTO implements Serializable  {

	public CompanyCEODTO(String string, String string2, int i, String string3, String string4, boolean b) {
		// TODO Auto-generated constructor stub
		private String names;
		private String company;
		private int ages1;
		private String country;
		private String qualification;
		private boolean married1;
		
		public CompanyCEODTO(qualification, qualification, ages, qualification, qualification, married) {
			// TODO Auto-generated constructor stub
		}

		private int ages;
		private boolean married;

		public void CompanyCEODTO(String name, String company, int ages, String country, String qualification, boolean married) {
			super();
			this.names= name;
			this.company = company;
			this.ages1 = ages;
			this.country = country;
			this.qualification = qualification;
			this.married1 = married;
		}

		@Override
		public String toString() {
			return "CompanyCEODTO [name=" + names + ", company=" + company + ", age=" + ages1 + ", country=" + country
					+ ", qualification=" + qualification + ", married=" + married1 + ", daugtherDTO=]";
		}
		
		
		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return 30;
		}

		@Override
		public boolean equals(Object obj) {
			if (obj != null) {
				if (obj instanceof CompanyCEODTO) {
					CompanyCEODTO companyCEODTO = (CompanyCEODTO) obj;
					if (companyCEODTO.getNames().equals(this.names)) {

						System.out.println("Cheacking Sucessfully ");
						return true;
					}

				}
			}
			return false;
		}
		

		public String getNames() {
			return names;
		}

		public String getCompany() {
			return company;
		}

		public int getAges() {
			return ages1;
		}

		public String getCountry() {
			return country;
		}

		public String getQualification() {
			return qualification;
		}

		public boolean isMarried() {
			return married1;
		}

		

		public void setName(String name) {
			this.names = name;
		}

		public void setCompany(String company) {
			this.company = company;
		}

		public void setAge(int age) {
			this.ages1 = age;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public void setQualification(String qualification) {
			this.qualification = qualification;
		}

		public void setMarried(boolean married) {
			this.married1 = married;
		}

	public CompanyCEODTO1() {
		// TODO Auto-generated constructor stub
	}

}
