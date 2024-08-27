package com.comment_api.graphqlserver.controller;

import java.util.List;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.comment_api.graphqlserver.records.Comment;

@Controller
public class PostController {
    
    @QueryMapping
    public List<Comment> commentById() {
        return null;
    }
}