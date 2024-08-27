package com.comment_api.graphqlserver.controller.records;

public record CommentLike (
    String id,
    String commentId,
    Integer like
){}