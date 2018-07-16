package com.example.inmemoryexample.controllers;


import com.example.inmemoryexample.objects.Film;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
public class FilmController {

    private List<Film> films = new ArrayList<>();

    @PostConstruct
    public void after(){
        films.add(new Film("1","Hp"));
    }

    @GetMapping("/")
    public String index(){
        return "index";
    }


    @GetMapping("/films/film/{id}")
    @ResponseBody
    public Film getFilm(@PathVariable("id") String id){
        return films.get(0);
    }
}
