package com.mov.movieinfoservice.controller;

import com.mov.movieinfoservice.model.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieController {
    @RequestMapping("/{movieId}")
    public Movie getmovie(@PathVariable("movieId") String movieId){
        return new Movie(movieId,"test Name","test description");
    }
}
