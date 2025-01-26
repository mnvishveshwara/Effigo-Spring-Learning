package com.in28minutes.springboot.Learn_spring_boot;

public class Course {

	private long id;
	private String nameString;
	private String authorString;
	
	
	public Course(long id, String nameString, String authorString) {
		super();
		this.id = id;
		this.nameString = nameString;
		this.authorString = authorString;
	}
	public long getId() {
		return id;
	}
	public String getNameString() {
		return nameString;
	}
	public String getAuthorString() {
		return authorString;
	}
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", nameString=" + nameString + ", authorString=" + authorString + "]";
	}
	
	
}
