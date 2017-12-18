package com.desdeaquimismo.backend.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.desdeaquimismo.backend.entities.User;

public interface UserRepository extends MongoRepository<User, String> {

}
