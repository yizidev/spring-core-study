package me.wonana.springcore;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

import me.wonana.springcore.book.Book;
import me.wonana.springcore.book.BookRepository;
import me.wonana.springcore.book.BookService;
import me.wonana.springcore.book.BookStatus;

@RunWith(SpringRunner.class)
public class SpringCoreApplicationTests {

	BookRepository bookRepository;
	
	@Test
	public void contextLoads() {
		
	}

}

