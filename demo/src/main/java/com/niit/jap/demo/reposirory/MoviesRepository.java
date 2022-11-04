package com.niit.jap.demo.reposirory;

import com.niit.jap.demo.Domain.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoviesRepository extends CrudRepository<Movie,Integer> {
}
