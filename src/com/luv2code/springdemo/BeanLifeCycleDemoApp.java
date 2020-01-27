package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.coach.Coach;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanLifecycleapplicationContext.xml");
		
		Coach theCoach = context.getBean("thatSillyCoach", Coach.class);

		System.out.println(theCoach.getDailyWorkOut());
		context.close();
		
	}
}
