package com.example.inmemoryexample.objects;

public class Film {

    String name;
    String id;

    public Film(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }



}
