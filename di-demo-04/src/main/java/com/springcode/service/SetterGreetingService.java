package com.springcode.service;

import org.springframework.stereotype.Component;

@Component
public class SetterGreetingService implements GreetingService {

	@Override
	public String sayHello() {
		return "Hello From Setter Greeting Service";
	}

}
