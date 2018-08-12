package com.love.team.pet.wechat.service.impl;

import com.love.team.pet.dao.CommentMapper;
import com.love.team.pet.dao.MyThemeMapper;
import com.love.team.pet.model.Theme;
import com.love.team.pet.wechat.service.MyThemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author fruit
 * @date on 2018年8月10日02:52:36
 */

@Service
@Transactional
public class MyThemeServiceImpl implements MyThemeService {

    @Autowired
    private MyThemeMapper myThemeMapper;

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public List<Theme> myFindTheme(String userId) {
        return myThemeMapper.findMyThemeAll(userId);
    }

    @Override
    public void deleteTheme(String token, String themeId) {
        myThemeMapper.deleteTheme(token,themeId);
        commentMapper.deleteComment(themeId);

    }
}
