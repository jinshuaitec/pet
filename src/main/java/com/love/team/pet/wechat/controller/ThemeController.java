package com.love.team.pet.wechat.controller;

import com.love.team.pet.model.Theme;
import com.love.team.pet.model.wechat.dto.FabulosDTO;
import com.love.team.pet.model.wechat.dto.ThemeDTO;
import com.love.team.pet.support.JSONResult;
import com.love.team.pet.support.Result;
import com.love.team.pet.wechat.service.ThemeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 话题模板
 * @author fruit                    @RequestBody ThemeDTO themeDTO
 * @date on 2018/8/7.
 */
@Api("话题")
@RestController
@RequestMapping(value = "/cute")
public class ThemeController {

    @Autowired
    ThemeService themeService;

    @GetMapping
    @RequestMapping(value = "/hottheme")
    @ApiOperation(value = "查询所有话题",notes = "根据接受时间查询,否者返回最新十条")
    public Result themeAll(String time) throws ParseException{
        Map<String,Object> modelMap=new HashMap<String, Object>();
        List<Theme> themes=themeService.findTheme(time);
        modelMap.put("themes",themes);
        
        return new JSONResult(modelMap);
    }

    @GetMapping
    @RequestMapping(value = "/themedetailed")
    @ApiOperation(value = "查询话题详细",notes = "")
    public Result themeDetailed(String theme){
        Map<String,Object> modelMap=new HashMap<String, Object>();
        List<Theme> list=themeService.findDetailed(theme);
        modelMap.put("list",list);
        return new JSONResult(modelMap);
    }

    @GetMapping
    @RequestMapping(value = "/savetheme")
    @ApiOperation(value = "发布话题",notes = "")
    public Result addTheme(@RequestBody ThemeDTO themeDTO){
        themeService.saveTheme(themeDTO);
        return new Result();
    }

    @GetMapping
    @RequestMapping(value = "/luckytheme")
    @ApiOperation(value = "点赞话题",notes = "")
    public Result goodlucky(@RequestBody  List<FabulosDTO> lucky){
        themeService.goodlucky(lucky);
        return new Result();
    }

}
