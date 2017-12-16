package com.desdeaquimismo.backend.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import com.desdeaquimismo.backend.entities.Post;

public interface PostRepository extends MongoRepository<Post, String>{
	List<Post> findByTitle(@Param("title") String title);
}
