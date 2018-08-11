package com.love.team.pet.dao;

import com.love.team.pet.model.CuteComment;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentMapper {

    CuteComment findThemeComment(String themeId);

    void deleteComment(String themeId);

}