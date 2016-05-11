package mum.edu.movie.Dao;

import java.util.Collection;

import mum.edu.movie.Model.User;



public interface UserDAO {
	public void SaveUser(User user);
	public void updateUser(User user);
	public User loadUser(long id);
	public void delete(User user);
	public Collection<User>getUser(long UserId);
}
