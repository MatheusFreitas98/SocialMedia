package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class Post {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	
	private String momentString;
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	private List<Comment> comment = new ArrayList<>();
	
	
	public Post(String momentString, String title, String content, Integer likes) throws ParseException {
		this.momentString = momentString;
		moment = sdf.parse(momentString);
		this.title = title;
		this.content = content;
		this.likes = likes;
	}


	public Date getMoment() {
		return moment;
	}


	public void setMoment(Date moment) {
		this.moment = moment;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public Integer getLikes() {
		return likes;
	}


	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	
	public void addComment(Comment comment) {
		this.comment.add(comment);
	}
	
	public void removeComent(Comment comment) {
		this.comment.remove(comment);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likes + " Likes - " + momentString + " \n");
		sb.append(content);
		return sb.toString();
	}

}
