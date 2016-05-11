package mum.edu.movie.Service;

import java.util.Collection;

import mum.edu.movie.Model.Movie;



public interface SearchService 
{
	
	public Movie  gettitle(String title);
	public Movie  getgener(String gener);
	public Movie  getrating(String rating);
	public Movie  getyear(long year);
	public Movie  getartist(String name);
	public Movie  getdirector(String name);
	public Collection<Movie> getAllMovies(long eventId);

	
}
