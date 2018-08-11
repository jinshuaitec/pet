package com.love.team.pet.model.wechat.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel(description = "获取点赞集合")
public class FabulosDTO implements Serializable {

    @ApiModelProperty(name = "id",value = "id",notes = "用户id")
    private String id;

    @ApiModelProperty(name = "token",value = "用户id",notes = "用户id")
    private String token;

    @ApiModelProperty(name = "theme",value = "话题id",notes = "话题id")
    private String themeId;

    @ApiModelProperty(name = "time",value = "时间",notes = "点赞时间")
    private Date time;


}
