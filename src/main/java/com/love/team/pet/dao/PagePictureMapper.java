package com.love.team.pet.dao;

import com.love.team.pet.model.PagePicture;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PagePictureMapper extends BaseMapper<PagePicture>{

    /**
     * 根据code查询轮播图
     * @param code
     * @return
     */
    List<String> homePage(String code);

    /**
     * 找主题url
     * @param cuteId
     * @return
     */
    PagePicture findThemeURL(String cuteId);

    /**
     * 添加url
     * @param pictures
     */
    void inMoreUrl(List<PagePicture> pictures);

}