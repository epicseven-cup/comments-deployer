package com.comment_api.graphqlserver.controller.records;

public record Reply (
    String id,
    String parentID,
    User user,
    String content
){}
