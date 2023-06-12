package com.springcore.springprac.teacher;

import java.util.Properties;

public class Teacher {
	
	private Properties name;
	private Properties subject;
	
	public Properties getName() {
		return name;
	}
	public void setName(Properties name) {
		this.name = name;
	}
	public Properties getSubject() {
		return subject;
	}
	public void setSubject(Properties subject) {
		this.subject = subject;
	}
	public Teacher(Properties name, Properties subject) {
		super();
		this.name = name;
		this.subject = subject;
	}
	public Teacher() {
		super();
		
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", subject=" + subject + "]";
	}
	
	
	
	
}
