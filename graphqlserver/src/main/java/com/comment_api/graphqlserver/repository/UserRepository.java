package com.comment_api.graphqlserver.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.util.Streamable;

import com.comment_api.graphqlserver.records.User;

public interface UserRepository extends MongoRepository<User, String> {
    Streamable<User> findUserById(String id);
}
