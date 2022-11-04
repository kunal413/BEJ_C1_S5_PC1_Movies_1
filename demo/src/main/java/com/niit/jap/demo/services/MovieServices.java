package com.niit.jap.demo.services;

import com.niit.jap.demo.Domain.Movie;

import java.util.List;

public interface MovieServices {
    public Movie addMovie(Movie movie);
    public List<Movie> getMovies();
}
