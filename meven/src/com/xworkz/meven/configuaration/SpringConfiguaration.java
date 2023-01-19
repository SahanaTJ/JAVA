package com.xworkz.meven.configuaration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.meven.things.Application;

@Configuration
@ComponentScan("com.xworkz.meven")
public class SpringConfiguaration {
	
	@Bean("Instagram")
	public Application application() {
		Application application = new Application("Instagram", "Android");
		
		return application;
		// TODO Auto-generated method stub

	}

}
