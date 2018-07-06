package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.config.YAMLConfig;

@SpringBootApplication
public class Spingprofiletest1Application implements CommandLineRunner {

	@Autowired
	private YAMLConfig config;

	public static void main(String[] args) {
		SpringApplication.run(Spingprofiletest1Application.class, args);

		System.out.println("https://www.mkyong.com/spring-boot/spring-boot-profile-based-properties-and-yaml-example");
	}
	
	@Override
    public void run(String... args) throws Exception {
        System.out.println(config.getEnvironment());
        System.out.println(config.getName());
    }

}
