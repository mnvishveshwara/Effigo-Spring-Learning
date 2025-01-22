package com.in28minutes.learn_spring_framework.helloworld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
		// Launch A Spring Context
		
		
		try(var context= new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){

			System.out.println(context.getBean("name"));

			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("address2"));
			
			System.out.println(context.getBean(Person.class));
			System.out.println(context.getBean(Address.class));
			
			System.out.println(context.getBean("person2MethodCall"));

			System.out.println("hi");
			System.out.println(context.getBean("person3Parameter"));
			
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
		}
		
		
		// Configure the thing that we want Spring to manage -@configuration
		
		
	}

}
