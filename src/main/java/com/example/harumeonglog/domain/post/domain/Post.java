package com.example.harumeonglog.domain.post.domain;

import com.example.harumeonglog.domain.member.domain.Member;
import com.example.harumeonglog.domain.post.domain.enums.PostCategory;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Post {

    private Long id;

    private Long postLikeNum;

    private String content;

    private Long postReportNum;

    private PostCategory category;

    private LocalDateTime deletedAt;

    private Member member;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
