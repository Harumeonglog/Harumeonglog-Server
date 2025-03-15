package com.example.harumeonglog.restDocs.controller;

import com.example.harumeonglog.domain.comment.controller.CommentController;
import com.example.harumeonglog.restDocs.base.AbstractRestDocsTest;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

@WebMvcTest(CommentController.class)
public class CommentControllerTest extends AbstractRestDocsTest {
}
