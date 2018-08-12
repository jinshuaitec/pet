package com.love.team.pet.dao;

import com.love.team.pet.model.LoginToken;

public interface LoginTokenMapper {
    int deleteByPrimaryKey(String id);

    int insert(LoginToken record);

    int insertSelective(LoginToken record);

    LoginToken selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(LoginToken record);

    int updateByPrimaryKey(LoginToken record);
}