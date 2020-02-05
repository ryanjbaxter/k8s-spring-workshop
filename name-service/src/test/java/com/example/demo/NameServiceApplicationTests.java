package com.example.demo;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static com.example.demo.NameServiceApplication.NAMES;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class NameServiceApplicationTests {

	@Autowired
	TestRestTemplate rest;

	@Test
	void contextLoads() {
		assertThat(NAMES).contains(rest.getForObject("/", String.class));
	}

}
