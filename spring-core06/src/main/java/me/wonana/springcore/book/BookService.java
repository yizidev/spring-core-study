package me.wonana.springcore.book;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	public Book save(Book book) {
		book.setCreated(new Date());
		book.setBookStatus(BookStatus.DRAFT);
		return bookRepository.save(book);
	}
	
	public void setBookRepository(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
}
