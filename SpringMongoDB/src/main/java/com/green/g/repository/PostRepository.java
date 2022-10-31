package com.green.g.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.green.g.model.Post;

public interface PostRepository extends MongoRepository<Post,String>

{

}
