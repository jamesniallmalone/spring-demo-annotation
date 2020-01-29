package com.luv2code.springdemo.fortune;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//Create an array of strings
	private String[] data = {
			"Ipsum",
			"Lorem",
			"Harry",
			"Potter"
	};
	
	private Random random = new Random();
	
	
	@Override
	public String getFortune() {
		
		//Return a random string

		int index = random.nextInt(data.length);
		
		return data[index];
	}

}
