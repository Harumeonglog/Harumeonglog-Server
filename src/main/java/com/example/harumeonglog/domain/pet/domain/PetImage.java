package com.example.harumeonglog.domain.pet.domain;


import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PetImage {

    private Long id;

    private String imageKey;

    private Pet pet;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
