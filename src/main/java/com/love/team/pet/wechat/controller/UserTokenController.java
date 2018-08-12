package com.love.team.pet.wechat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.love.team.pet.support.Result;
import com.love.team.pet.wechat.service.UserTokenService;

import io.swagger.annotations.Api;

/**
 * 令牌信息
 * @author dingfeng                   
 * @date on 2018/8/12.
 */
@Api("令牌信息")
@RestController
@RequestMapping(value = "/token")
public class UserTokenController {
	@Autowired
	private UserTokenService   userTokenService;
	//添加用户token	接收微信code 
	public Result addUserToken(String code) {
		String token = userTokenService.addToken(code);
		
		if(token!=null&&!token.equals("")) {
			return new Result(0,token);
		}else {
			return new Result(400,"异常错误");
		}
	}
	//通过token判断用户是否合法 接收 token
	public Result userIsRightful(String token) {
		boolean b = userTokenService.userIsRightful(token);
		if(b) {
			return new Result();
		}else {
			return new Result(400,"异常操作,token不存在");
		}
	}
	
}
