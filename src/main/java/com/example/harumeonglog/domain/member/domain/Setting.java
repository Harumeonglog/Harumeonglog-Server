package com.example.harumeonglog.domain.member.domain;


import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Setting {

    private Long id;

    private Boolean morningAlarm;

    private Boolean eventAlarm;

    private Boolean articleLikeAlarm;

    private Boolean commentAlarm;

    private Member member;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
