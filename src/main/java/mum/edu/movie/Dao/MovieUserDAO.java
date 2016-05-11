package mum.edu.movie.Dao;

import java.util.Collection;

import mum.edu.movie.Model.Comment;

public interface MovieUserDAO {
	public void SaveComment(Comment comment);
	public void updateCommen(Comment comment);
	public Comment loadComment(long id);
	public void delete(Comment comment);
	public Collection<Comment>getComment(long EventId);
}
