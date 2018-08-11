package com.love.team.pet.dao;

import com.love.team.pet.model.Theme;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MyThemeMapper {

    List<Theme> findMyThemeAll(String userId);

    void deleteTheme(@Param("token") String token, @Param("themeId") String themeId);
}