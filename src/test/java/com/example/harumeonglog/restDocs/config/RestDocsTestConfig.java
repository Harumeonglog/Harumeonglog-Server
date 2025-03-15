package com.example.harumeonglog.restDocs.config;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.restdocs.mockmvc.MockMvcRestDocumentation;
import org.springframework.restdocs.mockmvc.RestDocumentationResultHandler;

import static org.springframework.restdocs.headers.HeaderDocumentation.headerWithName;
import static org.springframework.restdocs.headers.HeaderDocumentation.requestHeaders;
import static org.springframework.restdocs.operation.preprocess.Preprocessors.*;
import static org.springframework.restdocs.operation.preprocess.Preprocessors.modifyHeaders;

@TestConfiguration
public class RestDocsTestConfig {

    @Bean
    public RestDocumentationResultHandler restDocs() {
        return MockMvcRestDocumentation.document(
                "{class-name}/{method-name}", // identifier
                preprocessRequest(prettyPrint(),
                        modifyHeaders()
                                .set("Authorization", "Bearer ${ACCESS_TOKEN}")
                                .remove("Content-Length")
                                .remove("Host")
                                .remove("accept")),
                preprocessResponse(prettyPrint(),
                        modifyHeaders()
                                .remove("Content-Length")),
                requestHeaders(
                        headerWithName("Authorization").description("Bearer ${ACCESS_TOKEN}")
                )
        );
    }
}
