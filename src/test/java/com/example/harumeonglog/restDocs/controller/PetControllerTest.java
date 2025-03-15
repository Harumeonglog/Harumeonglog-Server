package com.example.harumeonglog.restDocs.controller;

import com.example.harumeonglog.domain.pet.controller.PetController;
import com.example.harumeonglog.restDocs.base.AbstractRestDocsTest;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

@WebMvcTest(PetController.class)
public class PetControllerTest extends AbstractRestDocsTest {
}
