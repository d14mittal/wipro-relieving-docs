package com.learn.spring;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneservice;
	
	
	public TrackCoach() {
		super();
	}

	public TrackCoach(FortuneService fortuneservice) {
		super();
		this.fortuneservice = fortuneservice;
	}

	@Override
	public String getdailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a 100m sprint";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do it: "+fortuneservice.getFortune();
	}

}
