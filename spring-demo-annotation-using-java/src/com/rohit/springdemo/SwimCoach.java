package com.rohit.springdemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach{
	
	@Value("${foo.name}")
	private String name;
	@Value("${foo.mail}")
	private String email;
	
	
	FortuneService fortuneService;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Swin 1000m as warm up!!";
	}
	
	public String getDailyFortune() {
		return fortuneService.getFortune();	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
	
	
	
	
	
	
	

}
