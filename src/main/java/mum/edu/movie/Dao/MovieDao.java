package mum.edu.movie.Dao;

import java.util.Collection;

import mum.edu.movie.Model.Movie;



public  interface MovieDao {
	public void saveMovie(Movie movie);
	public Movie loadMovie(long id);
	public Collection<Movie> getMovie();
}
