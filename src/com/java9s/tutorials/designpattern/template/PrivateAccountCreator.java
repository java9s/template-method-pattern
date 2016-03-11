package com.java9s.tutorials.designpattern.template;

public class PrivateAccountCreator extends AccountCreator{

	@Override
	public void generateAccountNumber() {
		System.out.println("Private Account Number generated");
	}
	
}
