package com.example.harumeonglog.domain.walk.domain;


import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Track {

    private Long id;

    private Walk walk;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
