package com.love.team.pet.support;

import java.util.Map;

/**
 * Created by fonlin on 2017/9/8.
 * Result顶层
 */
public class Result {

    private int code;

    private String msg;

    public Result(Map<String,Object> modelMap) {
        this(ErrorCode.OK);
        this.modelMap=modelMap;
    }

    public Result() {
        this(ErrorCode.OK);
    }

    public Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result(ErrorCode httpCode) {
        this.code = httpCode.code();
        this.msg = httpCode.message();
    }

    public Map<String, Object> getModelMap() {
        return modelMap;
    }

    public void setModelMap(Map<String, Object> modelMap) {
        this.modelMap = modelMap;
    }

    private Map<String,Object> modelMap;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
