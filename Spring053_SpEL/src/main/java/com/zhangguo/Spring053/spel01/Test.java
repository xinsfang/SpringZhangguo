package com.zhangguo.Spring053.spel01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spel01.xml");
		Order order=ctx.getBean("order001",Order.class);
		System.out.println(order);
	}
}
