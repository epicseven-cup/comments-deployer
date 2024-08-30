package com.comment_api.graphqlserver.controller;

import java.util.List;

import org.springframework.data.util.Streamable;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.comment_api.graphqlserver.records.Comment;
import com.comment_api.graphqlserver.records.Post;
import com.comment_api.graphqlserver.repository.CommentRepository;
import com.comment_api.graphqlserver.repository.PostRepository;

@Controller
public class PostController {

    CommentRepository commentRepository;
    PostRepository postRepository;
    @QueryMapping
    public Streamable<Comment> commentById(@Argument String id) {
        return commentRepository.findCommentById(id);
    }

    @QueryMapping
    public Streamable<Post> postById(@Argument String id){
        return postRepository.findPostById(id);
    }
}