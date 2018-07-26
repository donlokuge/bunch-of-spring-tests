package com.example.jpatest1.jpa;


import com.example.jpatest1.JpaTest1Application;
import com.example.jpatest1.entity.Course;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Repository
@Transactional
public class CourseJAPRepository {

    Logger log = LoggerFactory.getLogger(this.getClass().getName());

    @Autowired
    EntityManager em;


    public Course addCourse(Course course) {
        em.persist(course);

        log.info("ADD COURSE ->{}",course.getId());
        return course;

    }


}
