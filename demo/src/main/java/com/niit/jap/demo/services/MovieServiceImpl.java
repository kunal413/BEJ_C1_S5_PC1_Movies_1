package com.niit.jap.demo.services;

import com.niit.jap.demo.Domain.Movie;
import com.niit.jap.demo.reposirory.MoviesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MovieServiceImpl implements  MovieServices {
    MoviesRepository moviesRepository;
    public MovieServiceImpl(MoviesRepository moviesRepository){
        this.moviesRepository=moviesRepository;
    }

    @Override
    public Movie addMovie(Movie movie) {
        return moviesRepository.save(movie);
    }

    @Override
    public List<Movie> getMovies() {
        return (List<Movie>) moviesRepository.findAll();
    }
}
