package com.learn.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//load spring config file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from container
		Coach coach=context.getBean("myCoach",Coach.class);
		
		//call method on bean
		System.out.println(coach.getdailyWorkout());
		System.out.println(coach.getDailyFortune());
		//close context
		context.close();
	}
}
