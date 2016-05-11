package extra.mum.service;

import java.util.Collection;

import extra.mum.domain.Movie;

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
