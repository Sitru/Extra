package mum.edu.movie.DaoImpl;

import java.util.Collection;

import org.hibernate.SessionFactory;



import mum.edu.movie.Dao.MovieDao;
import mum.edu.movie.Model.Movie;
public class MovieDaoImpl implements MovieDao
{
	private SessionFactory sf;
	
	
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	public void saveMovie(Movie movie) {
		sf.getCurrentSession().persist(movie);
		
	}

	public Movie loadMovie(long id) {

		return (Movie)sf.getCurrentSession().get(Movie.class,id);
	}

	 @SuppressWarnings("uncheaked")
	public Collection<Movie> getMovie() {

		return sf.getCurrentSession().createQuery("select distinct m from Movie m ").list();
	}

	

}
