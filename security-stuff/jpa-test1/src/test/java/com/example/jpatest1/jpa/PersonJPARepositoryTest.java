package com.example.jpatest1.jpa;


import com.example.jpatest1.JpaTest1Application;
import com.example.jpatest1.entity.Person;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = JpaTest1Application.class)
public class PersonJPARepositoryTest {

    Logger log = LoggerFactory.getLogger(PersonJPARepositoryTest.this.getClass().getName());

    @Autowired
    PersonJPARepository personJPARepository;

    @Test
    public void basic_test(){
        assertEquals("Don", personJPARepository.findPerson(10001).getName());
    }

    @Test
    @DirtiesContext
    public void delete_test(){
        personJPARepository.deletePerson(10002);
        Person p = personJPARepository.findPerson(10002);
        assertNull(p);
    }

    @Test
    @DirtiesContext
    public void save_test(){
        Person person =  personJPARepository.findPerson(10001);
        assertEquals("Don",person.getName());

        person.setName("Don Lok");
        personJPARepository.save(person);


        person =  personJPARepository.findPerson(10001);
        assertEquals("Don Lok",person.getName());

    }

}
