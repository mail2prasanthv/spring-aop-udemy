package com.example.aop.aopproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.aop.aopproject.business.Business1;
import com.example.aop.aopproject.business.Business2;

@SpringBootApplication
public class AopProjectApplication implements CommandLineRunner {

	@Autowired
	private Business1 b1;

	@Autowired
	private Business2 b2;

	public static void main(String[] args) {
		SpringApplication.run(AopProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Test b1:" + b1.calculateSomething());
		System.out.println("Test b1:" + b2.calculateSomething());
	}

}
