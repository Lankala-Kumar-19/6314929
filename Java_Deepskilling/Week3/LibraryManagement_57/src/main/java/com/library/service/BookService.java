package com.library.service;
import com.library.repository.BookRepository;


public class BookService {
	
	
	private BookRepository bookrepo;
	
	public BookService(BookRepository bookrepo) {
		this.bookrepo=bookrepo;
	}
	
	public void print() {
		bookrepo.printName();
	}
}
