package com.luv2code.springdemo.coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.luv2code.springdemo.fortune.FortuneService;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
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
