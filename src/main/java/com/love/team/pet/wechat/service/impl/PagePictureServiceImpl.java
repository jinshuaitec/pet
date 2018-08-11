package com.love.team.pet.wechat.service.impl;

import com.love.team.pet.dao.PagePictureMapper;
import com.love.team.pet.model.PagePicture;
import com.love.team.pet.model.wechat.dto.PagePictureDTO;
import com.love.team.pet.wechat.service.PagePictureService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jins
 * @date on 2018/8/5.
 */
@Service("pagePictureServiceImpl")
@Transactional
public class PagePictureServiceImpl  extends BaseServiceImpl<PagePicture> implements PagePictureService {

    @Autowired
    private PagePictureMapper pagePictureMapper;

    @Override
    public PagePictureDTO findPagePicture() {
        PagePictureDTO pagePictureDTO = new PagePictureDTO();
        List<String> sowingMapList = pagePictureMapper.homePage("SOWING_MAP");
        pagePictureDTO.setSowingMap(sowingMapList);
        List<String> homePageList = pagePictureMapper.homePage("PAGE_MENU");
        pagePictureDTO.setPageMenu(homePageList);
        return pagePictureDTO;
    }
}
