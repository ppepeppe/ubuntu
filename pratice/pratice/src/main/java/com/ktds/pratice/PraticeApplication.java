package com.ktds.pratice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class PraticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PraticeApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
}
