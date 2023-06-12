package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.javaconfig") 
//@ComponentScan is not required with Bean annotation

public class JavaConfig {

	@Bean
	public Samosa getSamosa() {
		return new Samosa();
		
	}
	
	@Bean
	public Student getStudent() {
		// creating student object

		Student student = new Student(getSamosa());
		return student;
	}

}
