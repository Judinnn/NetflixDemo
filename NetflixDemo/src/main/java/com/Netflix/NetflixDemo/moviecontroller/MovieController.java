package com.Netflix.NetflixDemo.moviecontroller;

import com.Netflix.NetflixDemo.model.Movie;
import com.Netflix.NetflixDemo.service.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/movies")
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping
    public ResponseEntity<?> addMovie(@RequestBody Movie movie) {

        // for Validation
        if (movie.getName() == null || movie.getName().isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Movie name is reqired");
        }
        if (movie.getDescription() == null || movie.getDescription().isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Description is required");
        }


        Movie savedMovie = movieService.addMovie(movie);
        return ResponseEntity.status(HttpStatus.CREATED).body("Movie Saved");
    }

    // Get movie by ID
    @GetMapping("/{id}")
    public ResponseEntity<?> getMovieById(@PathVariable Long id) {

        Optional<Movie> movieOpt = movieService.getMovieById(id);

        if (movieOpt.isPresent()) {
            return ResponseEntity.ok(movieOpt.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Movie not found with id: " + id);
        }
    }

}
