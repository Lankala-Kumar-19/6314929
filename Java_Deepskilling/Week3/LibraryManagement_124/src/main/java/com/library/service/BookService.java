package com.library.service;
import com.library.repository.*;
public class BookService {

	private BookRepository bookrepo;
	
	public void setBookrepo(BookRepository bookrepo) {
		this.bookrepo=bookrepo;
	}
	
	public void print() {
		bookrepo.printName();
	}
}
