package com.love.team.pet.dao.expand;

import org.apache.ibatis.annotations.Mapper;

import com.love.team.pet.model.LoginToken;
@Mapper
public interface LoginTokenExpandMapper {
	//查询微信code在数据表中是否存在
	public LoginToken findWxCode(String wxCode);
	
	//通过token查询token表中是否有记录
	public LoginToken findToken(String token);
	
}
