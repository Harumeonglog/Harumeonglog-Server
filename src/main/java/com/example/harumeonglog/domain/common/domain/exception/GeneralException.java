package com.example.harumeonglog.domain.common.domain.exception;

import com.example.harumeonglog.domain.common.controller.code.BaseErrorCode;
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
