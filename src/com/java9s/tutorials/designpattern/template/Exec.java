package com.java9s.tutorials.designpattern.template;

public class Exec {
	public static void main(String[] args) {
		AccountCreator ac = new BusinessAccountCreator();
		ac.createAccount();
		AccountCreator pac = new PrivateAccountCreator();
		pac.createAccount();
	}
}
