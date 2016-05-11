package mum.edu.movie.Service;

import java.util.Collection;

import mum.edu.movie.Model.Comment;




public interface CommentService
{
	public Comment createComment(String comment, long commntId, long userId);

	public Comment getComment(long commentId);

	public Collection<Comment > getAllComment(long eventId);

	public void deleteComment(long id);

	public Comment updateComment(String comment, long eventId, long userId);
}
