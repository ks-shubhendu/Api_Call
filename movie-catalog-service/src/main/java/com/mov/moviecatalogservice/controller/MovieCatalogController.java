package com.mov.moviecatalogservice.controller;


import com.mov.moviecatalogservice.model.CatalogItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {

    @RequestMapping("/{userid}")
    public List<CatalogItem> getCatalog(@PathVariable ("userid" )String userid){

        return Collections.singletonList(
                new CatalogItem("Titanic","Movie#1",3,2012 )
        );
    }
}
