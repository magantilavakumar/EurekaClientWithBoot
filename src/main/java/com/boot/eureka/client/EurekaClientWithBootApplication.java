package com.boot.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EurekaClientWithBootApplication {

	static {
		System.out.print("Eureka Client With Boot");
	}
	public static void main(String[] args) {
		SpringApplication.run(EurekaClientWithBootApplication.class, args);
	}

}
