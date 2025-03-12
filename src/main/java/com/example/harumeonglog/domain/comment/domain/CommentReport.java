package com.example.harumeonglog.domain.comment.domain;

import com.example.harumeonglog.domain.member.domain.Member;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class CommentReport {

    private Long id;

    private Comment comment;

    private Member member;

    private LocalDateTime updatedAt;

    private LocalDateTime createdAt;
}
