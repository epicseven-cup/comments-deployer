package com.comment_api.graphqlserver.controller.records;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public record User (String id, String username){ 
}
