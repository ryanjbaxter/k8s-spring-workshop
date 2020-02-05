package com.example.demo;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class NameServiceApplication {

	public static final String[] NAMES = new String[]{"Paul", "John", "Ringo", "George"};
	private static final Random r = new Random();

	public static void main(String[] args) {
		SpringApplication.run(NameServiceApplication.class, args);
	}

	@GetMapping
	public String getName() {
		return NAMES[r.ints(0, NAMES.length).limit(1).findFirst().getAsInt()];
	}

}
