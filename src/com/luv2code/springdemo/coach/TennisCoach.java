package com.luv2code.springdemo.coach;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {
	
	@Override
	public String getDailyWorkOut() {
		return "spend 30 minutes practicing swings";
	}

}
