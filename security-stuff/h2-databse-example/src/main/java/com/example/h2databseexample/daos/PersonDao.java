package com.example.h2databseexample.daos;

import com.example.h2databseexample.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

@Repository
public class PersonDao {

    @Autowired
    JdbcTemplate jdbcTemplate;


    class PersonRowMapper implements RowMapper<Person>{

        @Override
        public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
            Person person  = new Person();
            person.setId(rs.getInt("id"));
            person.setName(rs.getString("name"));
            person.setLocation(rs.getString("location"));
            person.setBirthDate(rs.getTimestamp("birth_date"));

            return person;
        }
    }

    public List<Person> findAll(){
        return jdbcTemplate.query("select * from person", new BeanPropertyRowMapper(Person.class));
    }

    public List<Person> findByName(String name){
        return jdbcTemplate.query("select  * from person where name = ? ", new Object[]{name},
                new PersonRowMapper());
    }


    public Person findByID(int id){
        return jdbcTemplate.queryForObject("select  * from person where id = ? ", new Object[]{id}, new BeanPropertyRowMapper<>(Person.class));
    }


    public int deleteByID(int id){
        return jdbcTemplate.update("delete from person where id =?" , new Object[]{id});
    }


    public int addPerson(Person person){
       return jdbcTemplate.update("insert  into  PERSON (ID, NAME, LOCATION, BIRTH_DATE ) values (?,?,?,?)",
                new Object[]{person.getId(),
                        person.getName(),
                        person.getLocation(),
                        new Timestamp(person.getBirthDate().getTime())});
    }



}
