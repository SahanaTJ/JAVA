package com.xworkz.collection.om;

import java.awt.Window.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;

import com.xworkz.collection.om.dto.PalaceDto;

public class PalaceDTORunner {
  
	public static void main(String[] args) {

		Collection<PalaceDto> palaceDTOs = new ArrayList<PalaceDto>();
		palaceDTOs.add(new PalaceDto("Banglore palace", "Banglore", "Dharshan", true, 10));
		palaceDTOs.add(new PalaceDto("Mysore Palace", "Mysore", "Teja", false, 550));
		palaceDTOs.add(new PalaceDto("Tippu Sulthan palace", "Sriranga pattana", "Omkar", true, 200));
		palaceDTOs.add(new PalaceDto("Fort palace", "Chitadurga", "Vinoda", false, 101));
		palaceDTOs.add(new PalaceDto("Lalitha Mahal", "Mysore", "Akshara", true, 5021));

		Collection<ApplicationDTO> applicationDTOs = new LinkedList<ApplicationDTO>();
		applicationDTOs.add(new ApplicationDTO("Hospital ", 5.6, true, "google", 2500));
		applicationDTOs.add(new ApplicationDTO("Hotel ", 5.6, true, "facebook", 1500));
		applicationDTOs.add(new ApplicationDTO("Insurence ", 5.6, false, "yahoo", 150));
		applicationDTOs.add(new ApplicationDTO("Enterprice Applications ", 5.6, false, "amezon", 36254));
		applicationDTOs.add(new ApplicationDTO("Web Applications ", 5.6, true, "twitter", 98546));
		applicationDTOs.add(new ApplicationDTO("Mobile Applications ", 5.6, false, "Meta", 2510));

		Collection<DataBaseVenderDTO> dataBaseVenderDTOs = new LinkedList<DataBaseVenderDTO>();
		dataBaseVenderDTOs.add(new CompanyCEODTO());


		Collection<CompanyCEODTO> companyCEODTOs = new LinkedList<CompanyCEODTO>();
		companyCEODTOs.add(new CompanyCEODTO("Omkar", "Xworkz", 20, "india", "BE/Btech", true));
		companyCEODTOs.add(new CompanyCEODTO("Sahana", "TechRef", 14, "india", "BE/Btech/Bcom/Bse", false));
		companyCEODTOs.add(new CompanyCEODTO("yashu", "First America", 35, "india", "MBA/Mse/Mcom", true));
		companyCEODTOs.add(new CompanyCEODTO("shalini", "Signiwins", 38, "india", "BE/Msc/Btech/MBA", false));
		companyCEODTOs.add(new CompanyCEODTO("veena", "BNV", 7, "india", "BE/Btech/MCA", true));

		Collection<DaugtherDTO> daugtherDTOs = new LinkedList<DaugtherDTO>();
		daugtherDTOs.add(new DaugtherDTO("Shilpa", 9900775088L, 21, false, true));
		daugtherDTOs.add(new DaugtherDTO("Vinutha", 7022537779L, 25, true, true));
		daugtherDTOs.add(new DaugtherDTO("Bhavana ", 9244537206L, 38, false, false));
		daugtherDTOs.add(new DaugtherDTO("Gouri", 7464578945L, 0, true, false));
		daugtherDTOs.add(new DaugtherDTO("amulya", 6352145144L, 35, true, false));

//	find all the properties Palace DTO which is Not Destroyed	

		palaceDTOs.stream().filter(ele -> !ele.getDestroyed()).collect(Collectors.toList())
				.forEach(ele -> System.out.println(ele));

		System.out.println(System.lineSeparator());
		System.out.println("Find All ApplicationDTO which is free and Developed By Google");
//	Find All ApplicationDTO which is free and Developed By Google	
		applicationDTOs.stream().filter(ele -> ele.isFree() && "google".contains(ele.getDevelopedBy()))
				.collect(Collectors.toList()).forEach(ele -> System.out.println(ele));

		// Find all ApplicaionDTo where version greter than 5 and collect only name
		System.out.println(System.lineSeparator());
		System.out.println(" Find all ApplicaionDTo where version greter than 5 and collect only name");
		applicationDTOs.stream().filter(ele -> ele.getVersion() > 5).collect(Collectors.toList())
				.forEach(ele -> System.out.println(ele.getName()));
//	find all Databasee venderDTo  Convert DevelopedBy Upper case And Print all Dto

		System.out.println(System.lineSeparator());
		System.out.println("find all Databasee venderDTo  Convert DevelopedBy Upper case And Print all Dto");

//	Find All DataBaseVenderDto where licenceCost less than 100 and Type is SQl
		System.out.println(System.lineSeparator());
		System.out.println("Find All DataBaseVenderDto where licenceCost less than 100 and Type is SQl");
		dataBaseVenderDTOs.stream().filter(ele -> ele.getLicenceCost() < 100 && ele.getType().equals("SQL"))
				.collect(Collectors.toList()).forEach(ele -> System.out.println(ele));

// print all DatabaseVendor Dto Types
		System.out.println(System.lineSeparator());
		System.out.println(" print all DatabaseVendor Dto Types");
		dataBaseVenderDTOs.stream().map(ele -> ele.getType()).collect(Collectors.toList())
				.forEach(ele -> System.out.println(ele));
// print detiles of companyCEO Dtos Daathoughter Dto
		System.out.println(System.lineSeparator());
		System.out.println("print detiles of companyCEO Dtos Daathoughter Dto");
		companyCEODTOs.stream().collect(Collectors.toList()).forEach(ele -> System.out.println(ele));
		System.out.println(System.lineSeparator());
		System.out.println("Dauthor dtos");
		daugtherDTOs.stream().collect(Collectors.toList()).forEach(ele -> System.out.println(ele));

//	print all Daughtor Dto names Of Company Ceos

		System.out.println(System.lineSeparator());
		System.out.println("//	print all Daughtor Dto names Of Company Ceos");
		daugtherDTOs.stream().map(ele -> ele.getName()).collect(Collectors.toList())
				.forEach(ele -> System.out.println(ele));

//	Get toatal CompanyDtos where age is Gretherthan 30
		System.out.println(System.lineSeparator());
		System.out.println("	Get toatal CompanyDtos where age is Gretherthan 30");
		companyCEODTOs.stream().filter(ele -> ele.getAges() > 30).collect(Collectors.toList())
				.forEach(ele -> System.out.println(ele));

//	print Below formate from CompanyCetdto  father age 7 doughter age 0

		System.out.println(System.lineSeparator());
		System.out.println("//	print Below formate from CompanyCetdto  father age 7 doughter age ");
		daugtherDTOs.stream().filter(ele->ele.getAges()==7).collect(Collectors.toList()).forEach(ele->System.out.println(ele.getAge()==0));
		
	}

}


