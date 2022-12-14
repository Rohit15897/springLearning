package com.rohit.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
public class TennisCoach implements Coach{
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("This is the defualt constructor");
	}
	
	
	@PostConstruct
	public void doMyStartupStuffs() {
		System.out.println("this method is: doMyStartupStuffs");
	}
	
	@PreDestroy
	public void doMyCleanStuffs() {
		System.out.println("this method is: doMyCleanStuffs");
	}
	
//	@Autowired
//	public TennisCoach(HappyFortuneService fortuneSertive) {
//		this.fortuneService = fortuneSertive;
//	}
	
	@Override
	public String getDailyWorkout() {
		System.out.println("this method is called");
		// TODO Auto-generated method stub
		return "Practice your backhand valley";
	}

	@Override
	public String getFortuneService() {
		System.out.println("this method is called");
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
//	@Autowired
//	public void setDoMyStuffs(FortuneService somename) {
//		fortuneService = somename;
//	}
	
	
}
