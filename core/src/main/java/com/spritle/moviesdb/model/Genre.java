package com.spritle.moviesdb.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Genre implements Serializable{
		
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String genrename;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "genres")
	private List<Movie> movies;
}