package me.wonana.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

	@Autowired
	ApplicationContext ctx;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Singleton");
		System.out.println(ctx.getBean(Single.class));
		System.out.println(ctx.getBean(Single.class));
		System.out.println(ctx.getBean(Single.class));
		
		System.out.println("Prototype");
		System.out.println(ctx.getBean(Proto.class));
		System.out.println(ctx.getBean(Proto.class));
		System.out.println(ctx.getBean(Proto.class));
		
		System.out.println("Prototype By Singleton");
		System.out.println(ctx.getBean(Single.class).getProto());
		System.out.println(ctx.getBean(Single.class).getProto());
		System.out.println(ctx.getBean(Single.class).getProto());
	}

}
