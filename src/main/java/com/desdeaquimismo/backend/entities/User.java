package com.desdeaquimismo.backend.entities;

import java.util.Arrays;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="users")
public class User {
	
	@Id
	private String id;
	
	@NotBlank
	@Length(max=60)
	private String name;
	
	@NotBlank
	@Length(max=60)
	private String lastName;
	
	@NotBlank
	@Indexed
	@Length(max=100)
	private String email;
	
	private String role;

	public User(String name, String lastName, String email, String role) {
		
		if (Arrays.asList("Administrator", "Author", "User").contains(role)) {
			this.name = name;
			this.lastName = lastName;
			this.email = email;
			this.role = role;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLast_name() {
		return lastName;
	}

	public void setLast_name(String last_name) {
		this.lastName = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		if (Arrays.asList("Administrator", "Author", "User").contains(role)) {
			this.role = role;
		}
	}

	public String getId() {
		return id;
	}

}
