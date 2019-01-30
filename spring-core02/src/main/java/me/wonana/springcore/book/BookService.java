package me.wonana.springcore.book;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

public class BookService {
	
	private BookRepository bookRepository;
	
	public BookService() {
	}
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	public Book save(Book book) {
		book.setCreated(new Date());
		book.setBookStatus(BookStatus.DRAFT);
		return bookRepository.save(book);
	}
	
 
	public BookRepository getBookRepository() {
		return bookRepository;
	}

	public void setBookRepository(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
}
