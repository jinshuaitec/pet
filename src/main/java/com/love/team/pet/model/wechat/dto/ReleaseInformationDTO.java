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
@ApiModel(description = "发布信息")
public class ReleaseInformationDTO {

    @ApiModelProperty(name = "id",value = "id",notes = "用户id")
    private String id;

    @ApiModelProperty(name = "title",value = "标题",notes = "标题")
    private String title;

    @ApiModelProperty(name = "content",value = "内容",notes = "内容")
    private String content;

    @ApiModelProperty(name = "province",value = "省",notes = "省")
    private String province;

    @ApiModelProperty(name = "city",value = "城市",notes = "城市")
    private String city;

    @ApiModelProperty(name = "area",value = "区",notes = "区")
    private String area;

    @ApiModelProperty(name = "imageUrl",value = "图片链接",notes = "url数组")
    private List<String> imageUrl;


}
