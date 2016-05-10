package mum.edu.movie.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class User {
private String Fname;
private String LName;
@Id
private long user_id;
private String passward;
private String emailAdress;
@OneToMany(mappedBy="user")
private List<Comment> comment=new ArrayList<Comment>();
public User(String fname, String lName, long user_id, String passward, String emailAdress, List<Comment> comment) {
	super();
	Fname = fname;
	LName = lName;
	this.user_id = user_id;
	this.passward = passward;
	this.emailAdress = emailAdress;
	this.comment = comment;
}
public String getFname() {
	return Fname;
}
public void setFname(String fname) {
	Fname = fname;
}
public String getLName() {
	return LName;
}
public void setLName(String lName) {
	LName = lName;
}
public long getUser_id() {
	return user_id;
}
public void setUser_id(long user_id) {
	this.user_id = user_id;
}
public String getPassward() {
	return passward;
}
public void setPassward(String passward) {
	this.passward = passward;
}
public String getEmailAdress() {
	return emailAdress;
}
public void setEmailAdress(String emailAdress) {
	this.emailAdress = emailAdress;
}
public List<Comment> getComment() {
	return comment;
}
public void setComment(List<Comment> comment) {
	this.comment = comment;
}


}
