package com.rohit.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// load the spring configuration file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve the bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach basecoach = context.getBean("baseBallCoach", Coach.class);
		Coach cricketCoach = context.getBean("criCoach",Coach.class);
		
		//call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(basecoach.getDailyWorkout());
		System.out.println(cricketCoach.getDailyWorkout());
		
		
		
		//let's call the method for the fortune class
		
		System.out.println(basecoach.getDailyFortune());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(cricketCoach.getDailyFortune());
		
		
		//close the context
		context.close();

	}

}
