package com.example;

public class Bank {
	private int bal=100;
	public void withdraw(int amt) {
		if(amt<0)	throw new IllegalArgumentException("Amount should be positive");
		bal=bal-amt;
		System.out.println(amt+" is withdrawn from your account || Current balance: "+bal);
	}
}
