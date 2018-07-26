package com.example.jpatest1;

import com.example.jpatest1.entity.Person;
import com.example.jpatest1.jpa.PersonJPARepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class JpaTest1Application  implements CommandLineRunner {

    Logger log = LoggerFactory.getLogger(JpaTest1Application.this.getClass().getName());

    public static void main(String[] args) {
        SpringApplication.run(JpaTest1Application.class, args);
    }


    @Autowired
    PersonJPARepository personJPARepository;

    @Override
    public void run(String... args) throws Exception {
        log.info("Find by id-> {}", personJPARepository.findPerson(10001));

        Person person  = new Person();
        person.setId(10004);
        person.setName("10004");
        person.setLocation("AUCK");
        person.setBirthDate(new Date());

        log.info("addPerson -> {}", personJPARepository.save(person));

        log.info("Find all -> {}", personJPARepository.findAll());

    }
}
