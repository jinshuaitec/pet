package com.love.team.pet.wechat.service.impl;

import com.love.team.pet.model.PagePicture;
import com.love.team.pet.wechat.service.PagePictureService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author jins
 * @date on 2018/8/5.
 */
@Service("pagePictureServiceImpl")
@Transactional
public class PagePictureServiceImpl  extends BaseServiceImpl<PagePicture> implements PagePictureService {
}
