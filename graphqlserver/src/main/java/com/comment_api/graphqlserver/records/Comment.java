package com.comment_api.graphqlserver.records;

import java.util.ArrayList;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public record Comment (
    String id,
    String postId,
    User user, 
    String content 
){}