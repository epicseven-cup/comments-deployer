package com.comment_api.graphqlserver.records;

public record Reply (
    String id,
    String parentID,
    User user,
    String content
){}
