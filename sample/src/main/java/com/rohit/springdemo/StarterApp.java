package com.rohit.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@ComponentScan("com.rohit.springdemo")
@SpringBootApplication
@Configuration
public class StarterApp {
	
	public static void main(String args[]) {
		SpringApplication.run(StarterApp.class, args);
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StarterApp.class);
		
		ConfigFile obj = context.getBean(ConfigFile.class);
		
		System.out.println(obj.getValue());
		
		context.close();
		
		
		
	}

}
