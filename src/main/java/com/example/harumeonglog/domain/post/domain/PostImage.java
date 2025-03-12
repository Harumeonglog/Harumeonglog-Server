package com.example.harumeonglog.domain.post.domain;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostImage {

    private Long id;

    private String postImageKeyName;

    private Post post;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
