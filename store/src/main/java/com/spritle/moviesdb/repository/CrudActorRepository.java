package com.spritle.moviesdb.repository;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spritle.moviesdb.model.Actor;

@EnableJpaRepositories
@Repository
public interface CrudActorRepository extends CrudRepository<Actor,Long> {

}
