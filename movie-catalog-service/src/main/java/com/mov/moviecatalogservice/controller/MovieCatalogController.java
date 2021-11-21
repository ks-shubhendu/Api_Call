package com.mov.moviecatalogservice.controller;


import com.mov.moviecatalogservice.model.CatalogItem;
import com.mov.moviecatalogservice.model.Movie;
import com.mov.moviecatalogservice.model.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {

    @RequestMapping("/{userid}")
    public List<CatalogItem> getCatalog(@PathVariable ("userid" )String userid){

        RestTemplate restTemplate = new RestTemplate();

    List<Rating> ratings = Arrays.asList(
            new Rating("123",4),
            new Rating("235",5)
    );
    return ratings.stream().map(rating -> {
                Movie movie = restTemplate.getForObject("http://localhost:8082/movies/" +rating.getMovieId() ,Movie.class);
                System.out.println(rating.getMovieId());

                return new CatalogItem(movie.getMovieId(),movie.getName(), rating.getRating());
    })
            .collect(Collectors.toList());
    }
}
