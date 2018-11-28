package com.springcode.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springcode.service.GreetingService;

@Component
public class MyComponent {

	private GreetingService greetingService;
	
	@Autowired //Takes Primary Greeting Service
	public MyComponent(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}


	public String hello(){
		System.out.println("Hello");
		return greetingService.sayHello();
	}
}
