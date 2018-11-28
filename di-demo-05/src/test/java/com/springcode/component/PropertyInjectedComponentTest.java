package com.springcode.component;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.springcode.service.GreetinServiceImpl;

public class PropertyInjectedComponentTest {
	private PropertyInjectedComponent propertyInjectedComponent;
	
	@Before
	public void setUp() throws Exception{
		this.propertyInjectedComponent=new PropertyInjectedComponent();
		this.propertyInjectedComponent.greetingService=new GreetinServiceImpl();
	}
	
	@Test
	public void testGreeting() throws Exception{
		assertEquals(GreetinServiceImpl.HELLO_GURUS, this.propertyInjectedComponent.sayHello());
	}

}
