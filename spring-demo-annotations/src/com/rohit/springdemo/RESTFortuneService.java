package com.rohit.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "You will have a peace day!! from RESTFortuneService";
	}

}
