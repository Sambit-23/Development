package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	private List<String> friends;
	private Map<String, Double> feeStructure;
	private Properties props;


	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	public Map<String, Double> getFeeStructure() {
		return feeStructure;
	}

	public void setFeeStructure(Map<String, Double> feeStructure) {
		this.feeStructure = feeStructure;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", feeStructure=" + feeStructure + ", props=" + props + "]";
	}
	
	
}
