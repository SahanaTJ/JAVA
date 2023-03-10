package com.xworkz.collection.om;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Animals {
  
	public static void main(String args[]) {
		
		Collection<String> animal = new ArrayList<String>();
		   animal.add("Lion King");
		   animal.add("Tiger");
		   animal.add("Cheetah");
		   animal.add("Elephant");
		   animal.add("Crocodile");
		   animal.add("Dog");
		   animal.add("Cat");
		   animal.add("Hyenas");
		   animal.add("Kangroo");
		   animal.add("Wild Pig");
		   animal.add("Fox");
				
		   System.out.println(animal);
		   
		   System.out.println(System.lineSeparator());
		   
		   System.out.println("......Using the for each loop condition.......");
		   for(String ref:animal)
		   {
			  System.out.println(ref);
		   }
		   
		   System.out.println(System.lineSeparator());
				
		   Iterator<String> iterator = animal.iterator();
			
		   System.out.println("........Using the while loop condition.......");
		   while(iterator.hasNext())
		   {
			   String ref=iterator.next();
			   System.out.println(ref);
		   }
		   
		 }

	}