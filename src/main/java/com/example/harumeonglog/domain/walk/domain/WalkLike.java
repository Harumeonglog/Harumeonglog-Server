package com.example.harumeonglog.domain.walk.domain;

import com.example.harumeonglog.domain.member.domain.Member;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class WalkLike {
    private Long id;

    private Walk walk;

    private Member member;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
