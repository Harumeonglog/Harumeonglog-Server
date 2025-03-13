package com.example.harumeonglog.domain.walk.domain;

import lombok.Getter;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Getter
public class Walk {

    private Long id;

    private Double distance;

    private LocalTime time;

    private Double startLatitude;

    private Double startLongitude;

    private Long walkLikeNum;

    private Boolean isShared;

    private LocalDateTime deletedAt;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
