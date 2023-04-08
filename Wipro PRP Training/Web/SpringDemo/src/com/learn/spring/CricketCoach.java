package com.learn.spring;

public class CricketCoach implements Coach {
	private FortuneService fortuneservice;
	private String emailAddress;
	private String teamName;
	
	public CricketCoach() {
		System.out.println("Inside CricketCoach no-arg construct");
	}
	
	public void setEmailAddress(String emailAddress) {
		System.out.println("Email id is set");
		this.emailAddress = emailAddress;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setTeamName(String teamName) {
		System.out.println("Team Name is set");
		this.teamName = teamName;
	}
	
	public String getTeamName() {
		return teamName;
	}
	//setter method for injection
	public void setFortuneservice(FortuneService fortuneservice) {
		System.out.println("Inside CricketCoach setter method");
		this.fortuneservice = fortuneservice;
	}

	@Override
	public String getdailyWorkout() {
		return "Practice Batting and Ground Fielding";
	}

	@Override
	public String getDailyFortune() {
		return "Hit a Six "+fortuneservice.getFortune();
	}
}
