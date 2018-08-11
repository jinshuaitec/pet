package com.love.team.pet.model.wechat.dto;

import com.love.team.pet.model.PagePicture;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @auhor fruit
 * @date on 2018年8月10日02:54:23
 */

@Data
@ApiModel(description = "保存和修改话题")
public class ThemeDTO {

    private String id;

    @ApiModelProperty(name = "userId",value = "用户id",notes = "用户id")
    private String userId;

    @ApiModelProperty(name = "pictures",value = "图片",notes = "图片")
    private List<PagePicture> pictures;

    @ApiModelProperty(name = "commentId",value = "评论id",notes = "评论id")
    private String commentId;

    @ApiModelProperty(name = "fabulous",value = "点赞数量",notes = "点赞数量")
    private Integer fabulous;

    @ApiModelProperty(name = "content",value = "内容",notes = "内容")
    private String content;

    @ApiModelProperty(name = "lucky",value = "点赞集合",notes = "点赞集合")
    private List lucky=new ArrayList();
}
