package com.bridgelab.example;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication

public class SwaggerExamleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerExamleApplication.class, args);
	}

}
