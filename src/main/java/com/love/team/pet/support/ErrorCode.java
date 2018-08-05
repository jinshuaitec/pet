package com.love.team.pet.support;

/**
 * Created by fonlin on 2017/9/8.
 */
public enum ErrorCode {

    OK(0, "操作成功"),

    BAD_REQUEST(400, "请求有异常"),

    UNAUTHORIZED(401, "未认证"),

    FORBIDDEN(403, "访问被禁止"),

    NOT_FOUND(404, "找不到资源"),

    VALID_NOT_PASS(10, "请输入规范的数据！"),

    INTERNAL_SERVER_TIMEOUT(-2, "请求超时"),

    INTERNAL_SERVER_ERROR(-1, "服务器内部错误"),
    PASSWORK_IS_NULL (7001,"密码为空"),
    USERNAME_IS_NULL (7002,"账户号为空"),
    WECAHT_NO_IS_NULL ( 7003 ,"微信号为空"),
    TOKEN_EXCEPTION (7004,"token异常"),
    TOKEN_EXPIRED (7005,"token过期"),
    TOKEN_IS_NULL ( 7007,"token为空"),
    NONE_USER ( 7008,"不存在该用户"),
    PASSWORK_IS_INCORRECT (7009,"密码不正确"),
    USERNAME_REPETITION(7010,"账户号被占用"),
    TELPHONE_REPETITION(7011,"手机号被占用"),
    TELPHONE_IS_NULL(7012,"手机号为空"),
    AUTHCODE_IS_NULL(7013,"验证码为空"),
    AUTHCODE_EXPIRE_OR_ERROR(7014,"验证码过期或不合法");

    int code;

    String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }
}
