package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		AbstractApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/lifecycle/lcconfig.xml");
		context.registerShutdownHook();
        Mazza p =(Mazza) context.getBean("mazza");
        System.out.println(p);
        Gulugula r =(Gulugula) context.getBean("g");
        System.out.println(r);
        Annotation an=(Annotation) context.getBean("anno");
        System.out.println(an);
        
	}

}
