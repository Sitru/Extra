package mum.edu.movie.DaoImpl;

import java.util.Collection;

import org.hibernate.SessionFactory;

import mum.edu.movie.Dao.UserDAO;
import mum.edu.movie.Model.Movie;
import mum.edu.movie.Model.User;

public class UserDAOImpl implements UserDAO {
	private SessionFactory sf;
	public UserDAOImpl(SessionFactory sf)
	{
		this.sf=sf;
	}
	public void SaveUser(User user) {
		sf.getCurrentSession().persist(user);
		
	}
	public void updateUser(User user) {
		sf.getCurrentSession().saveOrUpdate(user);
		
	}
	public User loadUser(long id) {
		return (User)sf.getCurrentSession().get(User.class,id);
		
	}
	public void delete(User user) {
		sf.getCurrentSession().delete(user);
		
	}
	public Collection<User> getUser(long UserId) {
		return sf.getCurrentSession().createQuery("select distinct m from User m ").list();

	}
	
	

}
