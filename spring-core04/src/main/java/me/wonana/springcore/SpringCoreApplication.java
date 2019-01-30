package me.wonana.springcore;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import me.wonana.springcore.book.Book;
import me.wonana.springcore.book.BookService;

public class SpringCoreApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanDefinitionNames));
		BookService bookService = (BookService) context.getBean("bookService");
		System.out.println(bookService != null);
		
		Book book = new Book();
		Book result = bookService.save(book);
		System.out.println(result.getBookStatus());
	}

}

