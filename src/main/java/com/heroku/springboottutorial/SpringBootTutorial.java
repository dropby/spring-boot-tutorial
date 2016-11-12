package com.heroku.springboottutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootTutorial {
	
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootTutorial.class, args);
	}
}