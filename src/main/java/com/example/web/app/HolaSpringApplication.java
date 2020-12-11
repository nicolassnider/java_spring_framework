package com.example.web.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class HolaSpringApplication {

	@GetMapping("/hola")
	public String hola() {
		return "hola mundo con spring";
	}
	public static void main(String[] args) {
		SpringApplication.run(HolaSpringApplication.class, args);
	}

}
