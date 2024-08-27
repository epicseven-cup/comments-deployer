package com.comment_api.graphqlserver.controller.records;

public record PostLike (
    String id,
    String postId,
    Integer like
){}