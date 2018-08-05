package com.love.team.pet.wechat.service.impl;

import com.love.team.pet.model.UploadImage;
import com.love.team.pet.wechat.service.UploadImageService;
import com.love.team.pet.wechat.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author jins
 * @date on 2018/8/5.
 */
@Service("uploadImageServiceImpl")
@Transactional
public class UploadImageServiceImpl extends BaseServiceImpl<UploadImage> implements UploadImageService {
}
