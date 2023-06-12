package com.springcore.lifecycle;

public class Mazza {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println("setup the price");
		this.price = price;
	}

	public Mazza() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Mazza [price=" + price + "]";
	}
	
	public void init(){
		System.out.println("Initialization of the object");
	}
	
	public void destroy() {
		System.out.println("Object destroyed");
	}
	

}
