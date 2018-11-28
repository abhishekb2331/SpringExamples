package com.springcode.didemo03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.springcode.component.ConstructorInjectedComponent;
import com.springcode.component.MyComponent;
import com.springcode.component.PropertyInjectedComponent;
import com.springcode.component.SetterInjectedComponent;

@SpringBootApplication
@ComponentScan("com.springcode") //Enable Component Scan from given package rather than this package
public class DiDemo03Application {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(DiDemo03Application.class, args);
		
		MyComponent myComponent = (MyComponent) ctx.getBean("myComponent");
		System.out.println(myComponent.hello());
		
		System.out.println(ctx.getBean(PropertyInjectedComponent.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedComponent.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedComponent.class).sayHello());
	}
}
