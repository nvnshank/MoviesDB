package com.spritle.moviesdb;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import com.spritle.moviesdb.model.Actor;
import com.spritle.moviesdb.model.Genre;
import com.spritle.moviesdb.model.Movie;
import com.spritle.moviesdb.repository.CrudMovieRepository;

@SpringBootApplication
public class ServiceApp implements CommandLineRunner {

	@Autowired
	private CrudMovieRepository crudMovieRepository;

	public static void main(String[] args) {
		SpringApplication.run(ServiceApp.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {

		Actor actor1 = new Actor();
		actor1.setFirstname("John");
		actor1.setLastname("Abraham");
		actor1.setGender("Male");
		actor1.setDateofbirth(new Date());

		Actor actor2 = new Actor();
		actor2.setFirstname("Mahesh");
		actor2.setLastname("Babu");
		actor2.setGender("Male");
		actor2.setDateofbirth(new Date());

		Actor actor3 = new Actor();
		actor3.setFirstname("Ram");
		actor3.setLastname("Charan");
		actor3.setGender("Male");
		actor3.setDateofbirth(new Date());

		Actor actor4 = new Actor();
		actor4.setFirstname("Kamal");
		actor4.setLastname("Hasan");
		actor4.setGender("Male");
		actor4.setDateofbirth(new Date());

		Actor actor5 = new Actor();
		actor5.setFirstname("Salman");
		actor5.setLastname("Khan");
		actor5.setGender("Male");
		actor5.setDateofbirth(new Date());

		Actor actor6 = new Actor();
		actor6.setFirstname("Akshay");
		actor6.setLastname("Kumar");
		actor6.setGender("Male");
		actor6.setDateofbirth(new Date());

		Actor actor7 = new Actor();
		actor7.setFirstname("Ajith");
		actor7.setLastname("Kumar");
		actor7.setGender("Male");
		actor7.setDateofbirth(new Date());

		Actor actor8 = new Actor();
		actor8.setFirstname("Amitabh");
		actor8.setLastname("Bacchan");
		actor8.setGender("Male");
		actor8.setDateofbirth(new Date());

		Actor actor9 = new Actor();
		actor9.setFirstname("Pawan");
		actor9.setLastname("Kalyan");
		actor9.setGender("Male");
		actor9.setDateofbirth(new Date());

		Actor actor10 = new Actor();
		actor10.setFirstname("Nagarjuna");
		actor10.setLastname("Akkineni");
		actor10.setGender("Male");
		actor10.setDateofbirth(new Date());

		List<Actor> actorlist1 = new ArrayList<Actor>();
		actorlist1.add(actor1);
		actorlist1.add(actor2);
		actorlist1.add(actor3);
		actorlist1.add(actor4);
		actorlist1.add(actor5);

		List<Actor> actorlist2 = new ArrayList<Actor>();
		actorlist2.add(actor6);
		actorlist2.add(actor7);
		actorlist2.add(actor8);
		actorlist2.add(actor9);
		actorlist2.add(actor10);

		Genre genre1 = new Genre();
		genre1.setGenrename("Action");
		Genre genre2 = new Genre();
		genre2.setGenrename("Thriller");
		Genre genre3 = new Genre();
		genre3.setGenrename("Crime");
		Genre genre4 = new Genre();
		genre4.setGenrename("Mystery");
		Genre genre5 = new Genre();
		genre5.setGenrename("Documentary");
		Genre genre6 = new Genre();
		genre6.setGenrename("Biography");

		List<Genre> genrelist1 = new ArrayList<Genre>();
		genrelist1.add(genre1);
		genrelist1.add(genre2);
		genrelist1.add(genre3);
		
		List<Genre> genrelist2 = new ArrayList<Genre>();
		genrelist2.add(genre1);
		genrelist2.add(genre2);
		genrelist2.add(genre3);

		Movie movie1 = new Movie();
		movie1.setReleaseDate(new Date());
		movie1.setReview("Good Movie");
		movie1.setTitle("Dummy Movie Name 1");
		movie1.setActors(actorlist1);
		movie1.setGenres(genrelist1);
		
		Movie movie2 = new Movie();
		movie2.setReleaseDate(new Date());
		movie2.setReview("Must Watch");
		movie2.setTitle("Dummy Movie Name 2");
		movie2.setActors(actorlist2);
		movie2.setGenres(genrelist2);
		
		Movie movie3 = new Movie();
		movie3.setReleaseDate(new Date());
		movie3.setReview("One time watch");
		movie3.setTitle("Dummy Movie Name 3");
		movie3.setActors(actorlist1);
		movie3.setGenres(genrelist1);
		
		Movie movie4 = new Movie();
		movie4.setReleaseDate(new Date());
		movie4.setReview("Worst Movie");
		movie4.setTitle("Dummy Movie Name 4");
		movie4.setActors(actorlist2);
		movie4.setGenres(genrelist2);
		
		Movie movie5 = new Movie();
		movie5.setReleaseDate(new Date());
		movie5.setReview("Best Movie");
		movie5.setTitle("Dummy Movie Name 5");
		movie5.setActors(actorlist1);
		movie5.setGenres(genrelist1);
		
		Movie movie6 = new Movie();
		movie6.setReleaseDate(new Date());
		movie6.setReview("Recommended to watch");
		movie6.setTitle("Dummy Movie Name 6");
		movie6.setActors(actorlist2);
		movie6.setGenres(genrelist2);
	
		Movie movie7 = new Movie();
		movie7.setReleaseDate(new Date());
		movie7.setReview("Average Movie");
		movie7.setTitle("Dummy Movie Name 7");
		movie7.setActors(actorlist1);
		movie7.setGenres(genrelist1);
		
		Movie movie8 = new Movie();
		movie8.setReleaseDate(new Date());
		movie8.setReview("Top Rated Movie");
		movie8.setTitle("Dummy Movie Name 8");
		movie8.setActors(actorlist2);
		movie8.setGenres(genrelist2);
		
		Movie movie9 = new Movie();
		movie9.setReleaseDate(new Date());
		movie9.setReview("Dummy Review Comment");
		movie9.setTitle("Dummy Movie Name 9");
		movie9.setActors(actorlist1);
		movie9.setGenres(genrelist1);
	
		Movie movie10 = new Movie();
		movie10.setReleaseDate(new Date());
		movie10.setReview("Good Movie");
		movie10.setTitle("Dummy Movie Name 10");
		movie10.setActors(actorlist2);
		movie10.setGenres(genrelist2);
	
		crudMovieRepository.save(movie1);
		crudMovieRepository.save(movie2);
		crudMovieRepository.save(movie3);
		crudMovieRepository.save(movie4);
		crudMovieRepository.save(movie5);
		crudMovieRepository.save(movie6);
		crudMovieRepository.save(movie7);
		crudMovieRepository.save(movie8);
		crudMovieRepository.save(movie9);
		crudMovieRepository.save(movie10);

	}

}
