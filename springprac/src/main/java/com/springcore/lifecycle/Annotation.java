package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Annotation {
	private String sub;

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public Annotation() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Annotation [sub=" + sub + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("subject started");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("subject stopped");
	}

}
