package com.rohit.springdemo;

import java.io.FileWriter;
import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.google.gson.Gson;

public class JavaConfigDemoApp {
	
	public static void main(String args[]) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		TennisCoach coach = context.getBean("tennisCoach", TennisCoach.class);
		
		
		Gson gson = new Gson();
		//StringBuffer stringBuffer = new StringBuffer();
		//stringBuffer.append(gson.toJson(coach));
		String stringBuffer = gson.toJson(coach);
		
		System.out.println(stringBuffer + " this is the content" );
		
		try {
			FileWriter fw = new FileWriter("C:\\Users\\Administrator\\Downloads\\spring frame work jar\\abc.txt");
			fw.write(stringBuffer.toString());
		}catch(IOException e) {
			
		}
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		
		SwimCoach somename = context.getBean("swimCoach", SwimCoach.class);
		
		System.out.println(somename.getDailyWorkout());
		System.out.println(somename.getDailyFortune());
		
		System.out.println(somename.getName());
		System.out.println(somename.getEmail());
	}

}
