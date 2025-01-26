package com.in28minutes.springboot.Learn_spring_boot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseControler {

	@RequestMapping("/courses")
	public List<Course> retriveAllCourses(){
		return Arrays.asList(
				new Course(1, "LEarn Aws", "in28Minutes"),
				new Course(2, "Learn Dev", "in28Minutes"),
				new Course(3, "Learn Azure", "in28minutes")
				);
	}

}
