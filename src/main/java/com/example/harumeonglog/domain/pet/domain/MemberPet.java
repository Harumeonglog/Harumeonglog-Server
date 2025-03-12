package com.example.harumeonglog.domain.pet.domain;

import com.example.harumeonglog.domain.member.domain.Member;
import com.example.harumeonglog.domain.member.domain.enums.MemberPetRole;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class MemberPet {

    private Long id;

    private MemberPetRole role;

    private Pet pet;

    private Member member;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
