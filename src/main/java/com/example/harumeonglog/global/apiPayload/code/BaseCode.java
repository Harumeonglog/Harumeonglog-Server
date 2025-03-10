package com.example.harumeonglog.global.apiPayload.code;

import org.springframework.http.HttpStatus;

public interface BaseCode {
    HttpStatus getHttpStatus();
    String getMessage();
    String getCode();
}
