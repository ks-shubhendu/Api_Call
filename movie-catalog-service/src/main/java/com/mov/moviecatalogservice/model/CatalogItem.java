package com.mov.moviecatalogservice.model;

public class CatalogItem {

    private String moviename;
    private String description;
    private int rating;
    private int releaseyear;

    public CatalogItem(String moviename, String description, int rating, int releaseyear) {
        this.moviename = moviename;
        this.description = description;
        this.rating = rating;
        this.releaseyear = releaseyear;
    }

    public CatalogItem() {
    }

    public CatalogItem(String movieId, String name, int rating) {
    }

    public String getMoviename() {
        return moviename;
    }

    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getReleaseyear() {
        return releaseyear;
    }

    public void setReleaseyear(int releaseyear) {
        this.releaseyear = releaseyear;
    }
}
