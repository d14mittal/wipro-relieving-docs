package com.learn.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterApp {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from container
		CricketCoach coach=context.getBean("myCricketCoach",CricketCoach.class);
		
		//call method on bean
		System.out.println(coach.getdailyWorkout());
		System.out.println(coach.getDailyFortune());
		
		//call literal injection method
		System.out.println(coach.getEmailAddress());
		System.out.println(coach.getTeamName());
		//close context
		context.close();
	}
}
