package com.love.team.pet.support.core.exception;

import com.love.team.pet.support.ErrorCode;

/**
 * Created by jins on 2017/9/10.
 * 自定义Exception的顶层父类
 *
 * 我们可以利用 exception instanceof ApiException 来判断
 * 是否是自定义异常
 */

public class BusinessException extends RuntimeException {

    private ErrorCode httpCode;

    public BusinessException(ErrorCode httpCode) {
        super();
        this.httpCode = httpCode;
    }
    public BusinessException(ErrorCode httpCode, Throwable cause) {
        super(cause);
        this.httpCode = httpCode;
    }

    public BusinessException(ErrorCode httpCode, String message) {
        super(message);
        this.httpCode = httpCode;
    }
    public BusinessException(ErrorCode httpCode, String message, Throwable cause) {
        super(message,cause);
        this.httpCode = httpCode;
    }

    public ErrorCode getHttpCode() {
        return httpCode;
    }

    public void setHttpCode(ErrorCode httpCode) {
        this.httpCode = httpCode;
    }
}
