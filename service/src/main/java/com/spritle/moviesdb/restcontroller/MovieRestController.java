package com.spritle.moviesdb.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spritle.moviesdb.model.Movie;
import com.spritle.moviesdb.service.MovieService;

@RestController
public class MovieRestController {
	
	@Autowired
	private MovieService movieService;
	
	@GetMapping("/")
	public String healthCheck() {
		return "OK";
	}
	
	@GetMapping(path = "/movies/{id}")
	public ResponseEntity<Movie> findMovie(@PathVariable("id") Long id){
		
		Movie findMovie = movieService.findMovie(id);
		return new ResponseEntity<Movie>(findMovie,HttpStatus.FOUND);
	}
	
	@GetMapping(path = "/movies")
	public ResponseEntity<List<Movie>> findAllMovie(){
		
		List<Movie> allMovies = movieService.findAll();
		return new ResponseEntity<List<Movie>>(allMovies,HttpStatus.FOUND);
	}
	
	@PostMapping(path = "/movies")
	public ResponseEntity<Movie> createMovie(@RequestBody Movie movie){
		Movie savedMovie=movieService.saveMovie(movie);
		return new ResponseEntity<Movie>(savedMovie,HttpStatus.CREATED);
	}
	
	@PutMapping(path = "/movies")
	public ResponseEntity<Movie> updateMovie(@RequestBody Movie movie){
		Movie checkMovie=movieService.findMovie(movie.getId());
		if(!(checkMovie==null)) {
		Movie updatedMovie=movieService.updateMovie(movie);
		  return new ResponseEntity<Movie>(updatedMovie,HttpStatus.ACCEPTED);
		}
		else {
			return new ResponseEntity<Movie>(HttpStatus.NOT_MODIFIED);
		}
	}
	
	@DeleteMapping(path = "/movies/{id}")
    public ResponseEntity<String> deleteMovie(@PathVariable("id") Long id){
		Movie existingMovie = movieService.findMovie(id);
		if (movieService.deleteMovie(existingMovie)) {
			return new ResponseEntity<String>("Movie Deleted",HttpStatus.OK);
		} 
		else{
		return new ResponseEntity<String>("Movie Not Deleted",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}