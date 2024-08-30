package com.comment_api.graphqlserver.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.util.Streamable;
import com.comment_api.graphqlserver.records.Post;

public interface PostRepository extends MongoRepository<Post, String> {
    Streamable<Post> findPostById(String id);
}
