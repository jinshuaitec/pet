package com.love.team.pet.wechat.service;

import com.love.team.pet.model.Theme;

import java.util.List;

/**
 * @author fruit
 * @date on 2018年8月10日02:52:36
 */
public interface MyThemeService {
    List<Theme> myFindTheme(String userId);

    void deleteTheme(String token, String themeId);
}
