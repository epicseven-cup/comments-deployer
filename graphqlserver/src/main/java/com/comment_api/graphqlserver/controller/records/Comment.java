package com.comment_api.graphqlserver.controller.records;

import java.util.ArrayList;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public record Comment (String id, User user, String content, ArrayList<Comment> replies) {
}
