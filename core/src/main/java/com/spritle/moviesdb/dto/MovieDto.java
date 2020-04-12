package com.spritle.moviesdb.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spritle.moviesdb.model.Actor;
import com.spritle.moviesdb.model.Genre;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class MovieDto implements Serializable {
	private Long id;
	private String review;
	private Date releasedate;
	private String title;
	private List<Actor> actors=new ArrayList<Actor>();
	private List<Genre> genres =new ArrayList<Genre>();
	private Integer movieid;
	
}