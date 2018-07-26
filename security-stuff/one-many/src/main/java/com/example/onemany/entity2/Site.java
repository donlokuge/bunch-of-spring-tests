package com.example.onemany.entity2;


import com.example.onemany.entity.Review;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NamedQueries(
        value = {@NamedQuery(name = "all_sites",query = "select s from Site s")}
)
public class Site {

    @Id
    @GeneratedValue
    private  int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String code;

    @OneToMany( mappedBy = "site")
    private List<Camera> cameras = new ArrayList<>();

    public Site() {
    }

    public Site(String name, String code) {
        this.name = name;
        this.code = code;
        this.cameras = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void addReview(Camera camera) {
        this.cameras.add(camera);
    }

    public void removeReview(Camera camera) {
        this.cameras.remove(camera);
    }



    @Override
    public String toString() {
        return "Site{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +

                '}';
    }
}
