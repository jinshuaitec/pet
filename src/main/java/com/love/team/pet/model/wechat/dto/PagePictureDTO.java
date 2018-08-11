package com.love.team.pet.model.wechat.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author jins
 * @date on 2018/8/7.
 */
@Data
@ApiModel(description = "返回")
public class PagePictureDTO {

    @ApiModelProperty(name = "sowingMap",value = "轮播图")
    private List<String> sowingMap;

    @ApiModelProperty(name = "homePage",value = "菜单和图片")
    private List<String> pageMenu;
}
