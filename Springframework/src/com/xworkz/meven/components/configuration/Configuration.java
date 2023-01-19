package com.xworkz.springframework.components.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@org.springframework.context.annotation.Configuration
@ComponentScan("com.xworkz.springFramework")
public class Configuration {
    
	@Bean
    public String computer() {
		System.out.println();
		String computer = new String();
		return computer;
		
		@Bean
	    public String laptop() {
			
		}
	}
}
   







