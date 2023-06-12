package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
		System.out.println(context.getBean("person"));
		
		Addition add = (Addition) context.getBean("add");
		add.doSum();
	}

}
