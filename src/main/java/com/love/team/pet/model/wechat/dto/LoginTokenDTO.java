package com.love.team.pet.model.wechat.dto;

import java.util.Date;
import java.util.List;

import com.love.team.pet.model.PagePicture;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "用户身份令牌")
public class LoginTokenDTO {
	@ApiModelProperty(name = "userId", value = "用户id", notes = "用户id")
	private String userId;

	@ApiModelProperty(name = "userToken", value = "用户token", notes = "用户token")
	private String userToken;

	@ApiModelProperty(name = "lastLogin", value = "最后登录时间", notes = "最后登录时间")
	private Date lastLogin;

	@ApiModelProperty(name = "wxCode", value = "微信唯一序列码", notes = "微信唯一序列码")
	private String wxCode;
}
