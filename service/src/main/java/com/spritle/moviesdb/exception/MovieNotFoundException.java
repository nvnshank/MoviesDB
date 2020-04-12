package com.spritle.moviesdb.exception;

public class MovieNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -4246075150244552193L;
	
	public MovieNotFoundException(String message) {
		super(message);
	}

}