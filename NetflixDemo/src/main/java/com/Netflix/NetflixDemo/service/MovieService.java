package com.Netflix.NetflixDemo.service;

import com.Netflix.NetflixDemo.model.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    private final List<Movie> movieList = new ArrayList<>();
    private Long idCounter = 1L;
//Add Movie
    public Movie addMovie(Movie movie) {
        movie.setId(idCounter++);
        movieList.add(movie);
        return movie;
    }
//Get movie
    public Optional<Movie> getMovieById(Long id) {
        return movieList.stream()
                .filter(movie -> movie.getId().equals(id))
                .findFirst();
    }
}
