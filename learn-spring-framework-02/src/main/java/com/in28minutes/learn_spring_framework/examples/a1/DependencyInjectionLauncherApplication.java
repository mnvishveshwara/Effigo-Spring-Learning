package com.in28minutes.learn_spring_framework.examples.a1;
import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;



@Component
class YourBusiness{
	
	
	Dependency1 dependency1;
	
	Dependency2 dependency2;
	
//	@Autowired   // Field based injection
//Dependency1 dependency1;
//	
//	@Autowired		// Field based injection
//	Dependency2 dependency2;
	
	

//	@Autowired
//	public void setDependency1(Dependency1 dependency1) {
//		this.dependency1 = dependency1;
//	System.out.println("Setter based Injection");

//	}
//
//
//	@Autowired
//	public void setDependency2(Dependency2 dependency2) {
//		this.dependency2 = dependency2;
//	System.out.println("Setter based Injection");
//	}


	
	public YourBusiness(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
		System.out.println("Constructor Injection");
	}



	public String toString() {
		return "Using" + dependency1+" and " +dependency2;
	}
	
}

@Component
class Dependency1{
	
}


@Component
class Dependency2{
	
}



@Configuration
@ComponentScan
public class DependencyInjectionLauncherApplication {

	
	
	public static void main(String[] args) {

		try (var context=
		new AnnotationConfigApplicationContext(DependencyInjectionLauncherApplication.class))
		{
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println(context.getBean(YourBusiness.class));
		}
		
	}

}

