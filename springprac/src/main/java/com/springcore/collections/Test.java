package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		ApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/collections/collectionsconfig.xml");
		Emp emp = (Emp) context.getBean("emp1");
		System.out.println(emp);
		
		System.out.println(emp.getName());
		System.out.println(emp.getPhone());
		System.out.println(emp.getAddress());
		System.out.println(emp.getSalary());
		System.out.println(emp.getPhone().getClass().getName());

	}

}
