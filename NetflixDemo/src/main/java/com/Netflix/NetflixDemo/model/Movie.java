package com.Netflix.NetflixDemo.model;

public class Movie {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    private Long id;
    private  String name;
    private  String description;
    private  String genre;
    public Movie() {}

    public Movie(Long id, String name, String description, String genre) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.genre = genre;
}}
