package com.example.harumeonglog.restDocs.controller;

import com.example.harumeonglog.domain.member.controller.MemberController;
import com.example.harumeonglog.restDocs.base.AbstractRestDocsTest;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

@WebMvcTest(MemberController.class)
public class MemberControllerTest extends AbstractRestDocsTest {
}
