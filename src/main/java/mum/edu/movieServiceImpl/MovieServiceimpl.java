package mum.edu.movieServiceImpl;

import java.util.Collection;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import mum.edu.movie.Dao.MovieDao;
import mum.edu.movie.Model.Director;
import mum.edu.movie.Model.Movie;
import mum.edu.movie.Service.MovieService;



public class MovieServiceimpl implements MovieService{
 MovieDao moviedao;
 MovieServiceimpl(MovieDao moviedao)
 {
	 this.moviedao=moviedao;
 }
 	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Movie createMovie(int id,String title ,int rating,int year,String summary, String Dname, String qualiy ) {
		
		Movie movie=new Movie();
		Director dirctor=new Director(Dname, qualiy);
		return movie;
	}

	public Movie getMovie(long id) {
		
		return null;
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Collection<Movie> getAllMovie() {
		Collection<Movie> movies =  moviedao.getMovie();
		return movies;

	}


	public void deleteMovie(long id) {
		
		
	}

	public Movie updateMovie(int id,String title ,int rating,int year,String summary) {
		// TODO Auto-generated method stub
		return null;
	}


	public void likeMovie(long movieId, int like) {
		// TODO Auto-generated method stub
		
	}
	public Movie createMovie(int id, String title, int rating, int year, String summary) {
		// TODO Auto-generated method stub
		return null;
	}

}
