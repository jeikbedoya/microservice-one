package com.jeikode.microservice.one;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class OneApplication {
	
	@Value("${app.global.message}")
	private String localMessage;

	public static void main(String[] args) {
		SpringApplication.run(OneApplication.class, args);
	}

	@RequestMapping("/")
	public String sayHello() {
		return localMessage;
	}
}
