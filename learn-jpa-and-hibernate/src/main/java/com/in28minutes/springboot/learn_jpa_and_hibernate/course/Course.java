package com.in28minutes.springboot.learn_jpa_and_hibernate.course;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {

	@Id
	private long id;
	
	private String name;
	
	private String author;
	
	
	
	
	public Course() {
	}
	
	

	public Course(long id, String nameString, String author) {
		super();
		this.id = id;
		this.name = nameString;
		this.author = author;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNameString() {
		return name;
	}

	public void setNameString(String nameString) {
		this.name = nameString;
	}

	public String getAuthorString() {
		return author;
	}

	public void setAuthorString(String authorString) {
		this.author = authorString;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", nameString=" + name + ", authorString=" + author + "]";
	}
	
	
}
