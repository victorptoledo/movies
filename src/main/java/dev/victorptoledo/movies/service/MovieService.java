package dev.victorptoledo.movies.service;

import dev.victorptoledo.movies.domain.Movie;
import dev.victorptoledo.movies.repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> AllMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> movieById(ObjectId id) {
        return movieRepository.findById(id);
    }
}
