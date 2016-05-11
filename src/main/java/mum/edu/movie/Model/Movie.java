package mum.edu.movie.Model;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


@Entity
public class Movie implements Serializable{
	private static final long serialVersionUID = 1L;
	
    @Id @GeneratedValue
	private long id;
    private String summary;
    private String title;
    private int year;
	@ElementCollection
	private  List<Director> directors = new ArrayList<Director>();
	@ManyToMany(mappedBy="movies")
	private List<Artist> artists= new ArrayList<Artist>();
    @ElementCollection
    @OneToMany
	private List<Comment> comments = new ArrayList<Comment>();
	@Lob
    private byte[] cover;
	private int rating;
	private String genre;
	
	public Movie(){
		super();
	}
	










	public Movie(long id, String summary, String title, int year, List<Director> directors, List<Artist> artists,
			List<Comment> comments, byte[] cover, int rating, String genre) {
		super();
		this.id = id;
		this.summary = summary;
		this.title = title;
		this.year = year;
		this.directors = directors;
		this.artists = artists;
		this.comments = comments;
		this.cover = cover;
		this.rating = rating;
		this.genre = genre;
	}


	public List<Comment> getComments() {
		return comments;
	}





	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}





	public void setId(long id) {
		this.id = id;
	}


	public void addDirector(Director dirctor)
	{
		directors.add(dirctor);
		
	}
	/*public void addComment(String comment){
		comments.add(comment);
	}
*/
	public void addArtists(Artist artist){
		artists.add(artist);
	}
	

	
	public List<Artist> getArtists() {
		return artists;
	}
	public void setArtists(List<Artist> artist) {
		this.artists = artist;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public long getId() {
		return id;
	}
	public byte[] getCover() {
		return cover;
	}
	public void setCover(byte[] cover) {
		this.cover = cover;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public List<Director> getDirectors() {
		return directors;
	}

	public void setDirectors(List<Director> directors) {
		this.directors = directors;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String toString(){
		return "Movie Title : "+getTitle()+ ",Rating: "+getRating()+" Artists " + getArtists().toString() ;  
		
	}
	
}
	
