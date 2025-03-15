package com.example.harumeonglog.restDocs.controller;

import com.example.harumeonglog.domain.event.controller.EventController;
import com.example.harumeonglog.restDocs.base.AbstractRestDocsTest;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

@WebMvcTest(EventController.class)
public class EventControllerTest extends AbstractRestDocsTest {
}
