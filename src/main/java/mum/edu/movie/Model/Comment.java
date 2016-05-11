package mum.edu.movie.Model;


import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Comment {
	
		@Id
	    @GeneratedValue
	    private long id;
	    private String comment;
	    @ManyToOne
	    private User user;
	   public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}
		public Rating getRating() {
			return rating;
		}
		public void setRating(Rating rating) {
			this.rating = rating;
		}
	@Enumerated(EnumType.STRING)
	   private Rating rating;
	    @ManyToOne
	    private Movie movie;
		public Comment() {
			super();
		}
		public Comment(String comment, Movie movie,User user) {
			super();
			this.comment = comment;
			
			this.movie = movie;
			this.user=user;
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getComment() {
			return comment;
		}
		public void setComment(String comment) {
			this.comment = comment;
	}
		
		public Movie getMovie() {
			return movie;
		}
		public void setMovie(Movie movie) {
			this.movie = movie;
		}
	}


