package com.love.team.pet.wechat.service;

import com.love.team.pet.model.wechat.dto.PagePictureDTO;

/**
 * @author jins
 * @date on 2018/8/5.
 */
public interface PagePictureService {

    /**
     * 查询首页面的图片
     * @return
     */
    PagePictureDTO findPagePicture();


}
