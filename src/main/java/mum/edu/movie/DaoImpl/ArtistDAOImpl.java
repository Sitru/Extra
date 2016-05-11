package mum.edu.movie.DaoImpl;

import java.util.Collection;

import org.hibernate.SessionFactory;

import mum.edu.movie.Dao.ArtistDAO;
import mum.edu.movie.Model.Artist;


public class ArtistDAOImpl implements ArtistDAO
{
	private SessionFactory sf;
	
	
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	
	public void saveArtist(Artist artist) {
		sf.getCurrentSession().persist(artist);
		
	}

	public Artist loadArtist(long id) {	
		return (Artist)sf.getCurrentSession().get(Artist.class,id);
	}
	
	@SuppressWarnings("unchecked")
	public Collection<Artist> getArtist() {

		return sf.getCurrentSession().createQuery("select distinct a from Artist a ").list();
	}
	@SuppressWarnings("unchecked")
	public Collection<Artist> getArtist(String name) {

		return sf.getCurrentSession().createQuery("select distinct a from Artist a where name=name").list();
	}
	
}
