package com.example.harumeonglog.domain.walk.domain;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class WalkPosition {

    private Long id;

    private Double latitude;

    private Double longitude;

    private Track track;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
