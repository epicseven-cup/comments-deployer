package com.comment_api.graphqlserver.controller;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.client.MongoClients;

public class MongoDatabase {
    MongoOperations mongoOps = new MongoTemplate(MongoClients.create(), "database");
    
}
