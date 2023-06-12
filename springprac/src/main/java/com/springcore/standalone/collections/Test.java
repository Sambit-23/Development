package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		ApplicationContext con = new ClassPathXmlApplicationContext(
				"com/springcore/standalone/collections/standaloneconfig.xml");
		Person per = con.getBean("person1", Person.class);

		System.out.println(per);
		System.out.println(per.getFriends().get(0));
		System.out.println(per.getFriends().getClass().getName());
		System.out.println("===============================================");
		System.out.println(per.getFeeStructure());
		System.out.println(per.getFeeStructure().getClass().getName());
		System.out.println("===============================================");
		System.out.println(per.getProps());
		System.out.println(per.getProps().getClass().getName());

	}
	
}
