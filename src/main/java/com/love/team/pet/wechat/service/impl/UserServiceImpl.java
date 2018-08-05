package com.love.team.pet.wechat.service.impl;

import com.love.team.pet.model.User;
import com.love.team.pet.wechat.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author jins
 * @date on 2018/8/5.
 */
@Service("userServiceImpl")
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {
}
