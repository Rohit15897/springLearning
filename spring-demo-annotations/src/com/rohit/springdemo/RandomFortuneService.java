package com.rohit.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService{
	
	private String[] data = {
		"Beware of the wolf in the sheep's clothing",
		"Diligence is the mother of good luck",
		"The journey is the reward"
	};
	
	private Random myRandom = new Random();
	
	
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(data.length);
		
		String fortune = data[index];
		
		// TODO Auto-generated method stub
		return fortune;
	}

}
