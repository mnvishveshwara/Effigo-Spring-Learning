package com.in28minutes.learn_spring_framework.examples.g1;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.inject.Inject;
import jakarta.inject.Named;



//@Component
@Named
class BusinessServices{
	private DataService dataService;
	
//	@Autowired
	@Inject
	public void setDataService(DataService dataService) {
		this.dataService=dataService;
	}
	
	public DataService getDataService() {
		System.out.println("Setter Injection done");
		return dataService;
	}
	
	
}

//@Component
@Named
class DataService{
	
}


@Configuration
@ComponentScan
public class CDIContextLauncherApplication {

	
	
	public static void main(String[] args) {

		try (var context=
		new AnnotationConfigApplicationContext(CDIContextLauncherApplication.class))
		{
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(BusinessServices.class).getDataService());
		}
		
	}

}

