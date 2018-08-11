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

    /**
     * 添加图片
     * @param pictures
     */
    @Override
    public void inster(List<PagePicture> pictures) {

        pictures=this.savepictureInfo(pictures);

        pagePictureMapper.inMoreUrl(pictures);
    }

    /**
     * 处理图片id,time ==
     * @param pictures
     * @return
     */
    private List savepictureInfo(List<PagePicture> pictures) {

        List<PagePicture> picturescopy = new ArrayList<PagePicture>();

        for(PagePicture pagePicture:pictures){
            super.savemoreInfo(pagePicture);
            picturescopy.add(pagePicture);
        }

        return picturescopy;
    }

}
