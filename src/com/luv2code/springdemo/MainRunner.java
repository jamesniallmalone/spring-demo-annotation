package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.coach.Coach;

public class MainRunner {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(theCoach.getDailyWorkOut());
		context.close();
		
	}
}
