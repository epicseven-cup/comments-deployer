package com.comment_api.graphqlserver.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.util.Streamable;

import com.comment_api.graphqlserver.controller.records.Comment;


public interface CommentRepository extends MongoRepository<Comment, String>{
    Streamable<Comment> findCommentById(String id);
}