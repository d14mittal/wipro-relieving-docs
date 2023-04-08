package com.learn.spring;

public class FootballCoach implements Coach {
	//dependency Injection field	
	private FortuneService fortuneservice;
	public FootballCoach(FortuneService thefortuneservice) {
		super();
		fortuneservice = thefortuneservice;
	}
	@Override
	public String getdailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice penalty and dribbling";
	}
	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneservice.getFortune();
	}
	
}
