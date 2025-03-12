package com.example.harumeonglog.domain.post.domain;

import com.example.harumeonglog.domain.member.domain.Member;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostLike {

    private Long id;

    private Member member;

    private Post post;
    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

}
