package com.example.harumeonglog.domain.member.domain;

import com.example.harumeonglog.domain.member.domain.enums.MemberPetRole;
import com.example.harumeonglog.domain.pet.domain.Pet;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Invitation {

    private Long id;

    private MemberPetRole role;

    private Member sender;

    private Member receiver;

    private Pet pet;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
