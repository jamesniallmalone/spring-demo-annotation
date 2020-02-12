package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.coach.Coach;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaC = context.getBean("tennisCoach", Coach.class);
		
		boolean res = (theCoach == alphaC);
		
		System.out.println("Pointing to same object in memory: " + res);
		
		System.out.println("location of thecoach: " + theCoach);
		System.out.println("location of alphaC: " + alphaC);
		
		context.close();
		
	}
}
