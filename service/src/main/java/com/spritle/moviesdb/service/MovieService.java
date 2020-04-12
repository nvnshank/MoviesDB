package com.spritle.moviesdb.service;

import java.util.List;

import com.spritle.moviesdb.model.Movie;

public interface MovieService {
	
	Movie findMovie(Long id);
	List<Movie> findAll();
	Movie updateMovie(Movie movie);
	Movie saveMovie(Movie movie);
	boolean deleteMovie(Movie movie);
}
