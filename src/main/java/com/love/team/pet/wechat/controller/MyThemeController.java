package com.love.team.pet.wechat.controller;

import com.love.team.pet.model.Theme;
import com.love.team.pet.support.JSONResult;
import com.love.team.pet.support.Result;
import com.love.team.pet.wechat.service.MyThemeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 我的话题模板
 * @author fruit
 * @date on 2018/8/7.
 */
@Api("话题")
@RestController
@RequestMapping(value = "/my-cute")
public class MyThemeController {

    @Autowired
    MyThemeService myThemeService;

    @GetMapping(value = "/my-theme")
    @ApiOperation(value = "查询自己的话题",notes = "根据接受时间查询")
    public JSONResult myThemeAll(String token){
        Map<String,Object> modelMap=new HashMap<String, Object>();
        List<Theme> list = myThemeService.myFindTheme(token);
        modelMap.put("list",list);
        return new JSONResult(modelMap);
    }

    @GetMapping(value = "/delete-theme")
    @ApiOperation(value = "查询自己的话题",notes = "根据接受时间查询")
    public Result deleteThemeA(String token, String themeId){
        myThemeService.deleteTheme(token,themeId);
        return new Result();
    }

}
