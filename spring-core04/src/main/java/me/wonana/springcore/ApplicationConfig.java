package me.wonana.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import me.wonana.springcore.book.BookRepository;
import me.wonana.springcore.book.BookService;

@Configuration
public class ApplicationConfig {
	
	@Bean
	public BookRepository bookRepository() {
		return new BookRepository();
	}
	
	@Bean
	public BookService bookService() {
		BookService bookService = new BookService();
		bookService.setBookRepository(bookRepository());
		return bookService;
	}
}
