package com.library.repository;

public class BookRepository {
	
	
	private String repo;
	
	public BookRepository(String repo) {
		this.repo=repo;
	}
	public void printName() {
		System.out.println("Reading "+repo);
	}
}
