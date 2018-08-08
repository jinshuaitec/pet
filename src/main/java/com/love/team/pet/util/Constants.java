package com.love.team.pet.util;


import java.io.File;

/**
 * Created by jins on 2017/3/15.
 */
public class Constants {

    /**
     * 默认查询条件
     */
    public static final Integer NUMBER_ZERO = 0;

    /**
     * 默认查询条件
     */
    public static final Integer NUMBER_ONE = 1;

    /**
     * 文件上传保存路径
     */
    public static final String UPLOAD_PATH = "data" + File.separator + "upload" + File.separator;

    /**
     * 判断上传文件类型是否匹配
     */
    public static final String UPLOAD_FILE_TYPE = "%pdf%,%jpg%,%gif%,%bmp%,%png%,%jpeg%";

    /**
     * 手机验证码信息
     */
    public static final String VERIFICATION_CODE_MESSAGE_CONTENT = "您的验证码为#code#，#minutes#分钟内有效。";

    /**
     * 手机验证码
     */
    public static final String SEND_TEL_NUMBER = "#code#";

    /**
     * 多少分钟后失效
     */
    public static final String SEND_TEL_MINUTES = "#minutes#";

}
