package com.example.demo;


public class Dollar {

	int amount;

	public Dollar(int amount) {
		this.amount = amount;
	}

	public void times(int multiplier) {
		amount *= multiplier;
	}

	
	
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	

}
