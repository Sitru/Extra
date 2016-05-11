package mum.edu.movie.Dao;

import java.util.Collection;

import mum.edu.movie.Model.Director;


public interface DirectorDao {

	public void saveDirector(DirectorDao director);
	public Director loadDirector(long id);
	public Collection<DirectorDao> getDirector();
}
