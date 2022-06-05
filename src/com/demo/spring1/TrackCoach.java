package com.demo.spring1;

public class TrackCoach implements Coach {
	
	//Update TrachCoach by FortuneService:
	private FortuneService fortuneService;
	
	
	public TrackCoach(FortuneService fortuneService) {
		//super();
		this.fortuneService = fortuneService;
	}
	
	

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "get DailyWorkout";
		
	}
	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	//add an init method:
	public void doMyStartupStuff(){
		System.out.println("TrachCoach: inside method doMyStartupStuff");
	}
	//add a destroy method:
	public void doMyCleanupStuffYoYo(){
		System.out.println("TrachCoach: inside method doMyCleanupStuffYoYo");
	}
}
