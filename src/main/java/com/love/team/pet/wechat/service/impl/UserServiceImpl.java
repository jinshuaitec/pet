package com.love.team.pet.wechat.service.impl;

import com.love.team.pet.dao.UserMapper;
import com.love.team.pet.model.User;
import com.love.team.pet.model.wechat.dto.UserDTO;
import com.love.team.pet.wechat.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author jins
 * @date on 2018/8/5.
 */
@Service("userServiceImpl")
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void save(UserDTO userDTO) {
        User user = transDTOToUser(userDTO);
        saveBasicInfo(user);
        userMapper.insert(user);
    }

    @Override
    public void update(UserDTO userDTO) {
        User user = userMapper.selectByPrimaryKey(userDTO.getId());
        BeanUtils.copyProperties(userDTO,user);
        userMapper.updateByPrimaryKey(user);
    }


    /**
     * 把接收过来的user转换成dto
     * @param userDTO
     * @return
     */
    private User transDTOToUser(UserDTO userDTO){
        User user = new User();
        BeanUtils.copyProperties(userDTO,user);
        return user;
    }
}
