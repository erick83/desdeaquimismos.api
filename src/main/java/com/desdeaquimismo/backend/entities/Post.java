package com.desdeaquimismo.backend.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="posts")
public class Post {
	
	@Id
	private String id;
	
	private String title;
	private String date;
	private boolean deleted;
	
	public Post() {}

	public Post(String title, String date) {
		this.title = title;
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
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
