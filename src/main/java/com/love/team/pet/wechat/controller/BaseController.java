package com.love.team.pet.wechat.controller;

import javax.servlet.http.HttpServletRequest;

/**
 * @author jins
 * @date on 2018/8/5.
 */
public class BaseController {


    public String fileUrl(HttpServletRequest request){
       return request.getSession().getServletContext().getRealPath("/");
    }
}
