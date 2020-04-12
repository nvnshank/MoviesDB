package com.spritle.moviesdb.repository;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spritle.moviesdb.model.Genre;

@EnableJpaRepositories
@Repository
public interface CrudGenreRepository extends CrudRepository<Genre,Long> {

}
