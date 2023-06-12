package com.springcore.sepl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {

		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/sepl/spelconfig.xml");
		Demo de = con.getBean("demo", Demo.class);
		System.out.println(de);

		SpelExpressionParser se = new SpelExpressionParser();
		Expression ex = se.parseExpression("09-080");
		System.out.println(ex.getValue());

	}

}
