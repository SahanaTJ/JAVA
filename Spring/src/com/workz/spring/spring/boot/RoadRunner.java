package com.workz.spring.spring.boot;

import com.workz.spring.spring.things.Road;

public class RoadRunner {
	public static void main(String args[]) {
		
	System.out.println("main ruuning");
	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringConfiguration.class);
				Road ref= applicationContext).getBean(Road.class);
				System.out.println(ref.toString());
	}

}
