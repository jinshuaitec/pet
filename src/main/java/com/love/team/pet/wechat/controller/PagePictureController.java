package com.love.team.pet.wechat.controller;

import com.love.team.pet.model.wechat.dto.PagePictureDTO;
import com.love.team.pet.support.JSONResult;
import com.love.team.pet.wechat.service.PagePictureService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 领养宠物页面图片
 * @author jins
 * @date on 2018/8/5.
 */
@Api(description = "领养宠物页面图片")
@RestController
@RequestMapping("/we-chat")
public class PagePictureController extends BaseController{

    @Autowired
    private PagePictureService pagePictureService;

    @ApiOperation(value = "查询领养宠物页面图片")
    @GetMapping("/page-pictures")
    public JSONResult pagePictureAllData(){
        PagePictureDTO dto = pagePictureService.findPagePicture();
        return new JSONResult(dto);
    }

}
