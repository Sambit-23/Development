package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {
public static void main(String[] args) {
	 
	ApplicationContext con=
			new AnnotationConfigApplicationContext(JavaConfig.class);
	Student st = con.getBean("getStudent",Student.class);
	System.out.println(st);
	System.out.println(st.hashCode());
	st.study();
}
}
