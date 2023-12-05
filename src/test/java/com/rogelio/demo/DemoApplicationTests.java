package com.rogelio.demo;

import com.rogelio.demo.json.Greeting;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.text.NumberFormat;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	private ApplicationContext ctx;

	@Test
	void contextLoads() {
	int count = ctx.getBeanDefinitionCount();
		System.out.println("there are"+count +"beans defined in app Context");
		Arrays.stream(ctx.getBeanDefinitionNames())
				.forEach(System.out::println);
	}
	@Test
	void noGreetingBeanInAppCtx(){
		assertThrows(NoSuchBeanDefinitionException.class,() -> ctx.getBean(Greeting.class));
	}

	/*@Test
	void formatUSCurrency(@Autowired NumberFormat usCurrencyFormat())*/

}
