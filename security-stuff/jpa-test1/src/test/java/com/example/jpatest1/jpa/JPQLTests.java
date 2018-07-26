package com.example.jpatest1.jpa;


import com.example.jpatest1.JpaTest1Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = JpaTest1Application.class)
public class JPQLTests {

    Logger log = LoggerFactory.getLogger(this.getClass().getName());


    @Autowired
    EntityManager em;

    @Test
    public void jpqltest1(){

        final List resultList = em.createQuery("select p from Person p").getResultList();

        log.info("select p from Person p ->{}",resultList);

        String q2 = "select p.name from Person p where p.name like 'Don'";

        final List l1 = em.createQuery(q2).getResultList();

        log.info(q2 + " ->{}", l1);

    }

}
