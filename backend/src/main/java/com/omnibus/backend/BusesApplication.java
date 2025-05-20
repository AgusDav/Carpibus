package com.omnibus.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BusesApplication {

	public static void main(String[] args) {
		System.out.println("🚀 PORT: " + System.getenv("PORT"));
		SpringApplication.run(BusesApplication.class, args);
	}
}
