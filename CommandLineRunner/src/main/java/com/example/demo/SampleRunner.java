package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class SampleRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		System.out.println("I am from the Command Liner runner interface  before Spring application starts");
		
	}

}
