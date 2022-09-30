package com.rohit.springdemo;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ConfigFile {
	private int value;
	
	//Some changes i have done lets see if this reflects
	
	public ConfigFile() {	}
	
	@PostConstruct
	public String toString() {	
		
		value += 1;
		return "I want to call this method";
		
		
		
	}
	
	
	public int getValue() {
		return value; 
	}
}
