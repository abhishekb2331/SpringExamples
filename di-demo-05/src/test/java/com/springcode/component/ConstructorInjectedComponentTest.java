package com.springcode.component;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.springcode.service.GreetinServiceImpl;

public class ConstructorInjectedComponentTest {

	private ConstructorInjectedComponent constructorInjectedComponent;
	
	@Before
	public void setUp() throws Exception{
		this.constructorInjectedComponent=new ConstructorInjectedComponent(new GreetinServiceImpl());
	}
	
	@Test
	public void testGreeting() throws Exception {
		assertEquals(GreetinServiceImpl.HELLO_GURUS, this.constructorInjectedComponent.sayHello());
	}

}
