package com.love.team.pet.wechat.service.impl;

import com.love.team.pet.model.AdoptPet;
import com.love.team.pet.wechat.service.AdoptPetService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author jins
 * @date on 2018/8/5.
 */
@Service("adoptPetServiceImpl")
@Transactional
public class AdoptPetServiceImpl extends BaseServiceImpl<AdoptPet> implements AdoptPetService {
}
