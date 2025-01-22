package com.in28minutes.learn_spring_framework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {};

record Address(String firstLine, String cityName) {};


@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Vishwa";
	}
	
	@Bean
	public int age() {
		return 24;
	}
	
	@Bean
	public Person person() {
		var person = new Person("Ravi",20, new Address("Main Streat", "HSR"));
		return person;
	}
	
	@Bean
	public Person person2MethodCall() {
		var person = new Person(name(), age(), address());
		return person;
	}
	
	@Bean
	public Person person3Parameter(String name, int age, Address address2) {
		var person = new Person(name, age, address2);
		return person;
	}
	
	@Bean
	@Primary
	public Person person4Parameter(String name, int age, Address address) {
		var person = new Person(name, age, address);
		return person;
	}
	
	@Bean
	public Person person5Qualifier(String name, int age,@Qualifier("address3Qualifier") Address address) {
		var person = new Person(name, age, address);
		return person;
	}
	
	@Bean(name="address2")
	@Primary
	public Address address() {
		var address= new Address("Mothinagar", "Hydrabad");
		return address;
	}
	
	@Bean(name="address3")
	@Qualifier("address3Qualifier")
	public Address address3() {
		var address= new Address("Mothinagarlolgfjjdf", "beng");
		return address;
	}
}
