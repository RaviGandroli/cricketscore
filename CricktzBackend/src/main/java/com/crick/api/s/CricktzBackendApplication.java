package com.crick.api.s;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.crick.api.s"})
public class CricktzBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CricktzBackendApplication.class, args);
	}

}
