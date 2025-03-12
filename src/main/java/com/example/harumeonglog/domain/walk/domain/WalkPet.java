package com.example.harumeonglog.domain.walk.domain;


import com.example.harumeonglog.domain.pet.domain.Pet;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class WalkPet {

    private Long id;

    private Walk walk;

    private Pet pet;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
