package com.example.mysqltest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing //Enable JPA Auditing in the main application.
public class MysqltestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MysqltestApplication.class, args);
	}
}
