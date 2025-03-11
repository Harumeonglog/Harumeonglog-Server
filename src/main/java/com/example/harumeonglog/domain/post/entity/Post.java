package com.example.harumeonglog.domain.post.entity;

import com.example.harumeonglog.domain.member.entity.Member;
import com.example.harumeonglog.domain.post.enums.PostCategory;
import com.example.harumeonglog.global.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Table(name = "post")
public class Post extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private Long id;

    @Column(name = "post_like_num", nullable = false)
    private Long postLikeNum;

    @Column(name = "content")
    private String content;

    @Column(name = "post_report_num", nullable = false)
    private Long postReportNum;

    @Column(name = "category", nullable = false)
    @Enumerated(EnumType.STRING)
    private PostCategory category;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;
}
