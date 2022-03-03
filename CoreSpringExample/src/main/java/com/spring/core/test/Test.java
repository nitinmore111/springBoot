package com.spring.core.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.core.app.AppConfig;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Object ob = ac.getBean("myViewResolver");
		
		System.out.println(ob);
		
		ac.close();
	}
}