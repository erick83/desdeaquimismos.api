package com.desdeaquimismo.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.desdeaquimismo.backend.entities.Post;
import com.desdeaquimismo.backend.services.PostService;

@RestController 
public class PostController {

	@Autowired
	private PostService postService;
	
	@RequestMapping("/")
	public String index() {
		return "hola";
	}
	
	@RequestMapping("/posts")
	public List<Post> posts(){
		return postService.getAllPost();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/post")
	public void newPost(@RequestBody Post post) {
		postService.insert(post);
	}
	
	/*@RequestMapping(value="/post", method=RequestMethod.POST)
	public String chckPost(@RequestBody Post post) {
		return "Title: " + post.getTitle();
	}*/
}
