package mum.edu.movie.Dao;

import java.util.Collection;

import mum.edu.movie.Model.Artist;



public interface ArtistDAO {
	public void saveArtist(Artist artist);
	public Artist loadArtist(long id);
	public Collection<Artist> getArtist();
	

}
