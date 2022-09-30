package com.rohit.springdemo;

public class TrackCoach implements Coach{
	
	
	private FortuneService fortuneService;
	
	
	public TrackCoach() {
		System.out.println("this constructor is being called");
	}

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do It "+fortuneService.getFortune();
	}
	
	//add an init method
	
	public void doMyStartupStuff() {
		System.out.println("Trackcoach: inside method doMyStartupStuff");
	}
	
	//add a destroy method
	
	public void doMyCleanupStuffYoYo() {
		System.out.println("Trackcoach: inside method doMyCleanupStuff");
	}
	
}
