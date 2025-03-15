package com.example.harumeonglog.restDocs.controller;

import com.example.harumeonglog.domain.post.controller.PostController;
import com.example.harumeonglog.restDocs.base.AbstractRestDocsTest;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

@WebMvcTest(PostController.class)
public class PostControllerTest extends AbstractRestDocsTest {
}
