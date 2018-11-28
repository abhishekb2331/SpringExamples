package com.springcode.service;

import org.springframework.stereotype.Component;

@Component
public class GreetinServiceImpl implements GreetingService{
	public static final String HELLO_GURUS="HELLO_GURUS";
	@Override
	public String sayHello() {
		return HELLO_GURUS;
	}

}
