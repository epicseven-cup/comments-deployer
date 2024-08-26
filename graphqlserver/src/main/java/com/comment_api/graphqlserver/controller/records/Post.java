package com.comment_api.graphqlserver.controller.records;

import java.util.ArrayList;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public record Post (String id, User user, String title, String content, ArrayList<Comment> comments){
}
