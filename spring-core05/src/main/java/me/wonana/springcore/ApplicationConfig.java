package me.wonana.springcore;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = SpringCoreApplication.class) // <- 이것을 통해 @Componet외 3종을 찾게된다.
// 직접 패키지경로를 입력하기보다 basePackageClasses 가 조금더 type-safe한 방법
public class ApplicationConfig {
	
//	@Bean
//	public BookRepository bookRepository() {
//		return new BookRepository();
//	}
//	
//	@Bean
//	public BookService bookService() {
//		BookService bookService = new BookService();
//		//의존성 주입을 직접하지 않고 service 클래스쪽에 @Autowired, @Inject로 주입할수 있다.
//		bookService.setBookRepository(bookRepository());
//		return bookService;
//	}
}
