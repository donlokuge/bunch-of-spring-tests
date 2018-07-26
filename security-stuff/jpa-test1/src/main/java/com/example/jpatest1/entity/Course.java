package com.example.jpatest1.entity;




import javax.persistence.*;

@Entity
@Table(name = "CourseDetails") // course_details
@NamedQueries(value = {
        @NamedQuery(name = "all_courses",query = "select c from Course c"),
        @NamedQuery(name="all_math" , query = "select c from Course c where name like 'Math'")
})
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "CourseName", nullable = false)
    private String name;

    public Course() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
