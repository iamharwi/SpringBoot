package com.controller;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private String student="";

	public String getStudent() {
		return student;
	}

	public void setStudent(String student) {
		this.student = student;
	}
	public String show(String student) {
		return "Helo "+student;
	}
	
	

}
