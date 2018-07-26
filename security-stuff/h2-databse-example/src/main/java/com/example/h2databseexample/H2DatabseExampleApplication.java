package com.example.h2databseexample;

import com.example.h2databseexample.daos.PersonDao;
import com.example.h2databseexample.entity.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class H2DatabseExampleApplication implements CommandLineRunner {

    Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    public static void main(String[] args) {
        SpringApplication.run(H2DatabseExampleApplication.class, args);
    }

    @Autowired
    PersonDao personDao;

    @Override
    public void run(String... args) throws Exception {

        logger.info("All the persions -> {}",personDao.findAll());

        logger.info("Find by id-> {}", personDao.findByID(10001));
        logger.info("delete by id-> {}", personDao.deleteByID(10002));

        Person person  = new Person();
        person.setId(10004);
        person.setName("10004");
        person.setLocation("AUCK");
        person.setBirthDate(new Date());

        logger.info("addPerson -> {}", personDao.addPerson(person));

        logger.info("Find by name-> {}", personDao.findByName("10004"));


        logger.info("All the persions -> {}",personDao.findAll());
    }
}
