package com.springcode.component;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.springcode.service.GreetinServiceImpl;
import com.springcode.service.GreetingService;

public class SetterInjectedComponentTest {

	private SetterInjectedComponent setterInjectedComponent;
	
	@Before
	public void setUp() throws Exception{
		this.setterInjectedComponent=new SetterInjectedComponent();
		this.setterInjectedComponent.setGreetingService(new GreetinServiceImpl());
	}
	
	@Test
	public void testGreeting() throws Exception{
		assertEquals(GreetinServiceImpl.HELLO_GURUS, this.setterInjectedComponent.sayHello());
	}

}
