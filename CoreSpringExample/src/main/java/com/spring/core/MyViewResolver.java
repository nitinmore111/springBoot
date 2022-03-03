package com.spring.core;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyViewResolver implements InitializingBean, DisposableBean {

	@Value("sample")
	private String prefix;
	
	
	public void afterPropertiesSet() throws Exception {
		System.out.println("FROM INIT METHOD");
	}
	
	
	public void destroy() throws Exception {
		System.out.println("FROM DESTORY METHOD");
	}

	@Override
	public String toString() {
		return "MyViewResolver [prefix=" + prefix + "]";
	}
	
	
}