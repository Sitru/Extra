package extra.mum.service;

import java.util.Collection;

import extra.mum.domain.Comment_M;


public interface CommentService
{
	public Comment_M createComment(String comment, long eventId, long userId);

	public Comment_M  getComment(long commentId);

	public Collection<Comment_M > getAllComment(long eventId);

	public void deleteComment(long id);

	public Comment_M  updateComment(String comment, long eventId, long userId);
}
