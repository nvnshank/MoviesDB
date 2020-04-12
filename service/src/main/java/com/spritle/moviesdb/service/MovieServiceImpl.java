package com.spritle.moviesdb.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spritle.moviesdb.dto.*;
import com.spritle.moviesdb.exception.MovieNotFoundException;
import com.spritle.moviesdb.model.*;
import com.spritle.moviesdb.repository.*;


@Transactional
@Service
public class MovieServiceImpl implements MovieService {
	
	private static final Logger LOG = LoggerFactory.getLogger(MovieService.class);
	
	@Autowired
	private CrudMovieRepository crudMovieRepository;
	
	public Movie findMovie(Long id) {
		
		Optional<Movie> movie=crudMovieRepository.findById(id);
		
		if (movie==null) {
		  throw new MovieNotFoundException("Movie with this ID is not available.");
		}
		return movie.get();
	}
	
	public Movie saveMovie(Movie movie) {
		
		Movie savedMovie=crudMovieRepository.save(movie);
		return savedMovie;		
	}
	
	public Movie updateMovie(Movie movie) {
		return saveMovie(movie);
	}
	
	public boolean deleteMovie(Movie movie) {
		boolean result=true;
		try {
		crudMovieRepository.delete(movie);
		}
		catch(Exception exception) {
			result=false;
		}
		return result;
	}

	@Override
	public List<Movie> findAll() {
	
		return (List<Movie>) crudMovieRepository.findAll();
	}
		
}