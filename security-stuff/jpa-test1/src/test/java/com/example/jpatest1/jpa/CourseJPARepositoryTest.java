package com.example.jpatest1.jpa;


import com.example.jpatest1.JpaTest1Application;
import com.example.jpatest1.entity.Course;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = JpaTest1Application.class)
public class CourseJPARepositoryTest {


    Logger log = LoggerFactory.getLogger(this.getClass().getName());

    @Autowired
    CourseJAPRepository courseJAPRepository;
    
    @Autowired
    EntityManager em;


    @Test
    @DirtiesContext
    public  void test_add_course(){

        Course course = new Course();
        course.setName("Pythod");

       course =  courseJAPRepository.addCourse(course);

       Assert.assertNotNull(course);
       Assert.assertTrue(course.getId() > 0);

    }
    
    
    @Test
    public void test_native_query(){
        final Query nativeQuery = em.createNativeQuery("select * from course_details where course_name = ?", Course.class);
        nativeQuery.setParameter(1,"Math");
        List list = nativeQuery.getResultList();

        log.info("test_native_query ->{}",list);
    }
    
    
}
