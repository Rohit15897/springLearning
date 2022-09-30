package com.rohit.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		//load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		
		System.out.println(coach.getFortuneService());
		
		
		boolean result = (coach == alphaCoach);
		
		System.out.println("Pointing to the same object: " +result);
		System.out.println("This object is in the address of:"+ coach);
		System.out.println("This object is in the address of: "+alphaCoach);
		
		
		context.close();
		
		// retrieve bean from spring container
		
		
		
		
		

	}

}
