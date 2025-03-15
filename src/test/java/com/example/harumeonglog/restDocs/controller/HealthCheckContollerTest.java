package com.example.harumeonglog.restDocs.controller;

import com.example.harumeonglog.domain.common.controller.HealthCheckController;
import com.example.harumeonglog.restDocs.base.AbstractRestDocsTest;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

@WebMvcTest(HealthCheckController.class)
public class HealthCheckContollerTest extends AbstractRestDocsTest {
}
