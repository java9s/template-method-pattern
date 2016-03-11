package com.java9s.tutorials.designpattern.template;

public class BusinessAccountCreator extends AccountCreator{

	@Override
	public void generateAccountNumber() {
		System.out.println("Business Account number generated");
	}
	
}
