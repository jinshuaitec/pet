package com.love.team.pet.wechat.service;

import com.love.team.pet.model.wechat.dto.UserDTO;

/**
 * @author jins
 * @date on 2018/8/5.
 */
public interface UserService {

    /**
     * 保存用户添加信息
     * @param userDTO
     */
    void save(UserDTO userDTO);

    /**
     * 修改用户添加信息
     * @param userDTO
     */
    void update(UserDTO userDTO);
}
