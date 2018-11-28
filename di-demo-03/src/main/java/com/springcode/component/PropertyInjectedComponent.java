package com.springcode.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springcode.service.GreetingService;

@Component
public class PropertyInjectedComponent {

	@Autowired
	public GreetingService greetingService;
	
	public String sayHello(){
		return greetingService.sayHello();
	}
}
