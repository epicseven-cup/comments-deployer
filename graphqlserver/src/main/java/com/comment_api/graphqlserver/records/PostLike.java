package com.comment_api.graphqlserver.records;

public record PostLike (
    String id,
    String postId,
    Integer like
){}