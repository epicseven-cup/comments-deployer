package com.comment_api.graphqlserver.records;

public record CommentLike (
    String id,
    String commentId,
    Integer like
){}