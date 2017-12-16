package com.desdeaquimismo.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desdeaquimismo.backend.entities.Post;
import com.desdeaquimismo.backend.repositories.PostRepository;

@Service
public class PostService {
	
	@Autowired
	private PostRepository postRepository;
	
	public List<Post> getAllPost() {
		return postRepository.findAll();
	}
	
	public void insert(Post post) {
		postRepository.save(post);
	}
	
	/*public List<Post> findByTitle(String title) {
		return postRepository.
	}*/
	
}
