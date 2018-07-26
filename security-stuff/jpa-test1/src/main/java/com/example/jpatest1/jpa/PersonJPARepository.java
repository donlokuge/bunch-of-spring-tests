package com.example.jpatest1.jpa;


import com.example.jpatest1.entity.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class PersonJPARepository {


    @PersistenceContext
    EntityManager entityManager;


    public Person findPerson(int id) {
        return entityManager.find(Person.class, id);

    }

    public Person save(Person person){
        if(person.getId() == 0){
            entityManager.persist(person);
        }else{
            entityManager.merge(person);
        }

        return person;
    }



    public void deletePerson(int id) {
        Person p = findPerson(id);
        entityManager.remove(p);
    }

    public List<Person> findAll() {
        final TypedQuery<Person> find_all = entityManager.createNamedQuery("find_all", Person.class);

        return find_all.getResultList();
    }


}
