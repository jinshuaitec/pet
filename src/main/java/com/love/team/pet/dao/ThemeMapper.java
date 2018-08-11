package com.love.team.pet.dao;

import com.love.team.pet.model.Theme;
import com.love.team.pet.model.wechat.dto.FabulosDTO;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ThemeMapper extends BaseMapper<Theme> {

    List<Theme> findAll();

    List<Theme> findDetailed(String theme);

    List<Theme> findTheme(Date time);

    void addLuckys(List<FabulosDTO> theme);
}