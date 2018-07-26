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
        films.add(new Film("12","ww2"));
        films.add(new Film("3","cars"));

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

    @GetMapping("/films")
    @ResponseBody
    public List<Film> getFilms(){
        return films;
    }
}
