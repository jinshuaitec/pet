package com.love.team.pet.wechat.service.impl;

import com.love.team.pet.model.ReleaseInformation;
import com.love.team.pet.wechat.service.ReleaseInformationService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author jins
 * @date on 2018/8/5.
 */
@Service("releaseInformationServiceImpl")
@Transactional
public class ReleaseInformationServiceImpl extends BaseServiceImpl<ReleaseInformation> implements ReleaseInformationService {
}
