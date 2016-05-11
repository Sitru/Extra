package extra.mum.service;

import java.util.Collection;


import extra.mum.domain.Movie;



public interface MovieService {

	public Movie createMovie(int id,String title ,int rating,int year,String summary );

	public Movie getMovie(long id);

	public Collection<Movie> getAllMovie();

	public void deleteMovie(long id);

	public Movie updateMovie(int id,String title ,int rating,int year,String summary);

	public void likeMovie(long movieId,int like);
}
