package mum.edu.movieServiceImpl;

import java.util.Collection;

import mum.edu.movie.Dao.MovieDao;
import mum.edu.movie.Dao.MovieUserDAO;
import mum.edu.movie.Dao.UserDAO;
import mum.edu.movie.Model.Comment;
import mum.edu.movie.Model.Movie;
import mum.edu.movie.Model.User;
import mum.edu.movie.Service.CommentService;


public class CommentServiceImpl implements CommentService
{
	private MovieUserDAO commentDao;
	private MovieDao movieDao;
	private UserDAO userDao;
	public CommentServiceImpl( MovieUserDAO commentDao,MovieDao movieDao,UserDAO userDao)
	{
		this.commentDao=commentDao;
		this.movieDao=movieDao;
		this.userDao=userDao;
	}
	
	public Comment createComment(String comment, long movieId, long userId) {
		Movie movie=movieDao.loadMovie(movieId);
		User user=userDao.loadComment(userId);
		Comment comments=new Comment(comment,movie,user);
		commentDao.SaveComment(comments);
		return comments;
	}

	
	public Comment getComment(long commentId) {
	
		return commentDao.loadComment(commentId);
	}


	public Collection<Comment> getAllComment(long commentId) {
		
		return commentDao.getComment(commentId);
	}


	public void deleteComment(long id) {
		Comment comment=commentDao.loadComment(id);
		commentDao.delete(comment);
		
	}


	public Comment updateComment(String comment, long movieId, long userId) {
		Movie movie=movieDao.loadMovie(movieId);
		User user=userDao.loadUser(userId);
		Comment comments=new Comment(comment,movie,user);
		return comments;
	}

	
}
