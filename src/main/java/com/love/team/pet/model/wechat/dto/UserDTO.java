package com.love.team.pet.model.wechat.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author jins
 * @date on 2018/8/5.
 */
@Data
@ApiModel(description = "保存和修改用户信息")
public class UserDTO {

    @ApiModelProperty(name = "id",value = "id",notes = "用户id")
    private String id;

    @ApiModelProperty(name = "qq",value = "qq",notes = "qq")
    private String qq;

    @ApiModelProperty(name = "weChat",value = "微信",notes = "微信")
    private String weChat;

    @ApiModelProperty(name = "phoneNumber",value = "电话号码",notes = "电话号码")
    private String phoneNumber;

    @ApiModelProperty(name = "idCard",value = "身份证号",notes = "身份证号")
    private String idCard;

    @ApiModelProperty(name = "email",value = "电子邮箱",notes = "电子邮箱")
    private String email;

    @ApiModelProperty(name = "sex",value = "性别",notes = "true是男,false是女")
    private boolean sex;

    @ApiModelProperty(name = "address",value = "用户地址",notes = "用户地址")
    private String address;
    
}
