package com.example;

public class PrimeChecker {
	public boolean isPrime(int n) {
		if(n==0 || n==1)
			return false;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0)	return false;
		}
		return true;
	}
}
