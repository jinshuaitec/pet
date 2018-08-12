package com.love.team.pet.wechat.service;

/**
 * @author asd97
 * @data 8.12
 * */
public interface UserTokenService {
	
	/**
	 * 给出微信code通过微信接口查询该用户是否已经注册
	 * 微信返回的是一个微信唯一凭证
	 * 去数据库查询如果该凭证不存在,则说明该用户并没有注册
	 * 若查询到了说明用户已经存在,则返回一个token
	 * */
	
	public String addToken(String code);
	
	/**
	 * 通过用户token查询用户是否合法
	 * 若该token在logintoken表中存在说明
	 * 该用户合法,校验通过
	 * */
	
	public boolean userIsRightful(String token);
}
