package com.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
@SpringBootApplication
public class StartApp {
	
	
	public static void main(String[] args) {
		ConfigurableApplicationContext con = SpringApplication.run(StartApp.class,args);
		Student stu = con.getBean(Student.class);
		stu.setStudent("Gagandeep Singh Rawat ");
		String valueToPrint = stu.getStudent();
		System.out.println("My name is " + valueToPrint);
		Company com = con.getBean(Company.class);
		com.show();

		
		
		
	}
}
 	