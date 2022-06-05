package com.demo.spring1;

public class CricketCoach implements Coach{
	
	//
	private FortuneService fortuneService;
	
	//Create a no-arg constructor:
	public CricketCoach() {
		System.out.println("Create a no-arg Constructor");
	}
	
	//Create setter method in the class for injections:
	//our setter method:
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Setter method");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "CricketCoach Class get dailyworkout";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
}
