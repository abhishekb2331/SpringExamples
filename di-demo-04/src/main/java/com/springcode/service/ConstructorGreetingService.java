package com.springcode.service;

import org.springframework.stereotype.Component;

@Component
public class ConstructorGreetingService implements GreetingService {

	@Override
	public String sayHello() {
		return "Hello From Constructor Greeting Service";
	}

}
