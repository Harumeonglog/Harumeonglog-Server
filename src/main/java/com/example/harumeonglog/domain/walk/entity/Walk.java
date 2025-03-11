package com.example.harumeonglog.domain.walk.entity;

import com.example.harumeonglog.global.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Table(name = "walk")
public class Walk extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "walk_id")
    private Long id;

    @Column(name = "distance", nullable = false)
    private Double distance;

    @Column(name = "time", nullable = false)
    private LocalTime time;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;
}
