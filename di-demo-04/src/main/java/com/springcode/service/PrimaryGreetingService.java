package com.springcode.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PrimaryGreetingService implements GreetingService{

	@Override
	public String sayHello() {
		return "Hello From Primary Greeting Service";
	}

}
