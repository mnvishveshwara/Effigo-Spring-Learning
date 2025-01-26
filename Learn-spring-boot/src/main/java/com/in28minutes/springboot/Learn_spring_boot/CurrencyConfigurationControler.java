package com.in28minutes.springboot.Learn_spring_boot;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigurationControler {

	@Autowired
	private CurrencySErviceConfiguration configuration;

	@RequestMapping("/currency-configuration")
	public CurrencySErviceConfiguration retriveAllCourses() {
		return configuration;
	}

}
