package com.comment_api.graphqlserver.controller.records;

public record Replies (
    String id,
    String parentID,
    User user,
    String content
){}
