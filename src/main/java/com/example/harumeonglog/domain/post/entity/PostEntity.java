package com.example.harumeonglog.domain.post.entity;

import com.example.harumeonglog.domain.member.entity.MemberEntity;
import com.example.harumeonglog.domain.post.entity.enums.PostCategory;
import com.example.harumeonglog.domain.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Table(name = "post")
public class PostEntity extends BaseEntity {

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
    private MemberEntity memberEntity;
}
