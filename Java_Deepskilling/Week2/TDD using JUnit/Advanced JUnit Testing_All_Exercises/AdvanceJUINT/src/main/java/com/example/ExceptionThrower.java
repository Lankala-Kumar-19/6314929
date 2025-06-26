package com.example;

public class ExceptionThrower extends Exception {
	public void throwException() throws Exception {
		throw new Exception();
	}
}
