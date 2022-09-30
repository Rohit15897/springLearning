package com.rohit.springdemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
//	@Bean 
//	public FortuneService happyFortuneService() {
//		return new HappyFortuneService();
//	}
	
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	@Bean
	public SwimCoach swimCoach(FortuneService fortuneService) {
		SwimCoach coach = new SwimCoach(sadFortuneService());
		
		return coach;
	}
	
	@Bean
	public TennisCoach tennisCoach() {
		return new TennisCoach();
	}
	
	
	
}
