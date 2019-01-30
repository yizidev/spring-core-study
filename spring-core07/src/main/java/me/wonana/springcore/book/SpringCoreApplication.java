package me.wonana.springcore.book;

import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.support.GenericApplicationContext;

import me.wonana.springcore.out.MyService;

@SpringBootApplication // <- @ComponentScan과 @SpringBootConfiguration이 들어있다.
public class SpringCoreApplication {
	
	@Autowired
	MyService myService;
	
	public static void main(String[] args) {
		var app = new SpringApplication(SpringCoreApplication.class);
		app.addInitializers((ApplicationContextInitializer<GenericApplicationContext>) ctx -> {
			ctx.registerBean(MyService.class);
			ctx.registerBean(ApplicationRunner.class, () -> args1 -> System.out.println("Functional Bean Definition"));
		});
		app.run(args);	
	}
	
	

}

