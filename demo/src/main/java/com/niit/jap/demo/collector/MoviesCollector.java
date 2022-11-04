package com.niit.jap.demo.collector;

import com.niit.jap.demo.Domain.Movie;
import com.niit.jap.demo.services.MovieServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie/v1")
public class MoviesCollector {
    MovieServices movieServices;
    @Autowired
    public MoviesCollector(MovieServices movieServices){
        this.movieServices=movieServices;
    }
    @PostMapping("/movie")
    public ResponseEntity<?>insertMovie(@RequestBody Movie movie){
        return new ResponseEntity<>(movieServices.addMovie(movie), HttpStatus.CREATED);
    }
}
