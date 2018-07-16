package com.example.securitytest1.controllers;


import com.example.securitytest1.objects.Film;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/films")
public class FilmController {

    List<Film> films = new ArrayList<>();


    @GetMapping("/all")
    @ResponseBody
    public List<Film> getFilms(){
        return films;
    }



}
