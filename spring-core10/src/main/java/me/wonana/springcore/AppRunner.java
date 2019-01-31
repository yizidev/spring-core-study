package me.wonana.springcore;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContext;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

	@Autowired
	ApplicationContext ctx;
	
	@Autowired
	MessageSource messageSource;
		
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println(messageSource.getClass());
		System.out.println(messageSource.getMessage("greeting", new String[] {"jeongwon"}, Locale.getDefault()));
		System.out.println(messageSource.getMessage("greeting", new String[] {"wona"}, Locale.KOREA));
		System.out.println(messageSource.getMessage("greeting", new String[] {"hana"}, Locale.ENGLISH));
		System.out.println(messageSource.getMessage("greeting", new String[] {"wonana"}, Locale.ENGLISH));
	}
}
