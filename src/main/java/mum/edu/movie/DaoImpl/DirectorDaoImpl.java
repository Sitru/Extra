package mum.edu.movie.DaoImpl;

import java.util.Collection;

import org.hibernate.SessionFactory;


import mum.edu.movie.Dao.DirectorDao;
import mum.edu.movie.Model.Director;

public class DirectorDaoImpl implements DirectorDao
{
private SessionFactory sf;
	
	
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	public void saveDirector(Director director) {
		sf.getCurrentSession().persist(director);
	}

	public Director loadDirector(long id) {
		return (Director)sf.getCurrentSession().get(Director.class,id);
	}
	@SuppressWarnings("unchecked")
	public Collection<DirectorDao> getDirector() {
		return sf.getCurrentSession().createQuery("select distinct d from Director d ").list();
	}
	public void saveDirector(DirectorDao director) {
		// TODO Auto-generated method stub
		
	}
	


}
