package com.luv2code.springdemo.coach;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.luv2code.springdemo.fortune.FortuneService;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
	}
	
	@PostConstruct
	public void doStartUpStuff() {
		System.out.println("In init method.");
	}
	
	@PreDestroy
	public void doCleanupStuff() {
		System.out.println("In destroy method.");
	}
	
	@Override
	public String getDailyWorkOut() {
		return "spend 30 minutes practicing swings";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
}
