package me.wonana.springcore.book;

import java.util.Date;

import javax.annotation.PostConstruct;

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
	
	@PostConstruct
	public void postCon() {
		System.out.println("서비스가 곧 생성됩니다.");
	}
}
