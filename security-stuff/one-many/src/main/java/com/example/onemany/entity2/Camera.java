package com.example.onemany.entity2;


import javax.persistence.*;

@Entity
public class Camera {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private String  name;

    @Column(nullable = false)
    private String code;


    @ManyToOne(fetch = FetchType.LAZY)
    private Site site;


    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public Camera(String name, String code) {
        this.name = name;
        this.code = code;
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

    @Override
    public String toString() {
        return "Camera{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
