package com.rohit.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

	public static void main(String args[]) {
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		 
		 Coach coach = context.getBean("myCoach", Coach.class);
		 
		 Coach alphaCoach = context.getBean("myCoach", Coach.class);
		 
		 
		 boolean result = (coach == alphaCoach);
		 
		 System.out.println("Pointing to the same object: "+result);
		 
		 System.out.println("My location for coach: "+coach);
		 System.out.println("My location for alphaCoach: "+alphaCoach);
		 
		 context.close();
	}
}
