package com.love.team.pet.wechat.service;

import com.love.team.pet.model.Theme;
import com.love.team.pet.model.wechat.dto.FabulosDTO;
import com.love.team.pet.model.wechat.dto.ThemeDTO;

import java.text.ParseException;
import java.util.List;

/**
 * @author fruit
 * @date on 2018年8月10日02:52:36
 */
public interface ThemeService {
    List<Theme> list();

    List<Theme> findDetailed(String theme);

    void saveTheme(ThemeDTO themeDTO);

    List<Theme> findTheme(String time) throws ParseException;

    void goodlucky(List<FabulosDTO> theme);
}
