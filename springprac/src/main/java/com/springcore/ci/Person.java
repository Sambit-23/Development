package com.springcore.ci;

public class Person {
	
	private String personName;
	private int personId;
	private Certificate certi;
	public Person(String personName, int personId,Certificate certi) {
		super();
		this.personName = personName;
		this.personId = personId;
		this.certi=certi;
		
	}

	@Override
	public String toString() {
		return this.personName+" : "+this.personId +"{"+this.certi+"}";
	}
	
}
