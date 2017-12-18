package com.desdeaquimismo.backend.entities;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="posts")
public class Post {
	
	@Id
	private String id;
	
	@NotBlank
	@Length(max=100)
	private String title;
	
	private Date date;
	private boolean deleted;
	
	public Post() {}

	public Post(String title, String date) {
		DateFormat df = DateFormat.getInstance();
		try {
			this.date = df.parse(date);
			this.title = title;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public String getId() {
		return id;
	}
	
}
