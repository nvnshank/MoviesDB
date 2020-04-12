package com.spritle.moviesdb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.spritle.moviesdb.model.Movie;

@EnableJpaRepositories
@Repository
public interface CrudMovieRepository extends PagingAndSortingRepository<Movie,Long> {
	
}
