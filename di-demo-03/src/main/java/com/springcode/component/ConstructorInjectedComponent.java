package com.springcode.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springcode.service.GreetingService;

@Component
public class ConstructorInjectedComponent {
	
	private GreetingService greetingService;

	@Autowired //No need for annotation framework directly injects to Constructor
	public ConstructorInjectedComponent(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}
	
	public String sayHello(){
		return greetingService.sayHello();
	}
}
