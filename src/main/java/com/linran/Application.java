package com.linran;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class Application {

	public static void main(String[] args) {
		System.out.println("http://localhost:8080");
		SpringApplication.run(Application.class, args);
	}

}
