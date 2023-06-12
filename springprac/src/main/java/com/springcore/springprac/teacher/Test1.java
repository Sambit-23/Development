package com.springcore.springprac.teacher;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/springprac/teacher/teacherconfig.xml");
		Teacher teacher =(Teacher) context.getBean("teacher");
		
		System.out.println(teacher);
	}

}
