package com.in28minutes.springboot.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.in28minutes.springboot.learn_jpa_and_hibernate.course.Course;

@Repository
public class CourseJdbcRepository {
	
	@Autowired
	private JdbcTemplate springJdbs;
	
	private static String INSERT_QUERY =
			"""
			insert into course (id, name, author)
values(?,?,?);
			""";
	
	private static String DELETE_QUERY=
			"""
			delete from course 
			where id=?
			""";
	
	
	private static String SELECT_QUERY=
			"""
			select id, name as nameString, author as authorString
        from course
        where id=?
			""";
	
	
	
	public void insert(Course course) {
		springJdbs.update(INSERT_QUERY, course.getId(),course.getNameString(), course.getAuthorString() );
	}
	
	
	public void deleteById(long id) {
		springJdbs.update(DELETE_QUERY,id);
	}
	
	public Course findById(long id) {
		return springJdbs.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class),id);	
	}
	
	

}
