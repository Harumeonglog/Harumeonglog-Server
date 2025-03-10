package com.example.harumeonglog.global.apiPayload.exception;

import com.example.harumeonglog.global.apiPayload.code.BaseErrorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GeneralException extends RuntimeException {

    private final BaseErrorCode baseErrorCode;

    @Override
    public String getMessage() {
        return baseErrorCode.getMessage();
    }
}
