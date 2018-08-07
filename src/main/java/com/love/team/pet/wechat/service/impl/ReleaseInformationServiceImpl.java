package com.love.team.pet.wechat.service.impl;

import com.love.team.pet.dao.ReleaseInformationMapper;
import com.love.team.pet.model.ReleaseInformation;
import com.love.team.pet.model.wechat.dto.ReleaseInformationDTO;
import com.love.team.pet.wechat.service.ReleaseInformationService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author jins
 * @date on 2018/8/5.
 */
@Service("releaseInformationServiceImpl")
@Transactional
public class ReleaseInformationServiceImpl extends BaseServiceImpl<ReleaseInformation> implements ReleaseInformationService {

    @Autowired
    private ReleaseInformationMapper releaseInformationMapper;

    @Override
    public void saveReleaseInformation(ReleaseInformationDTO dto) {
        ReleaseInformation releaseInformation = new ReleaseInformation();
        BeanUtils.copyProperties(dto,releaseInformation);
        saveBasicInfo(releaseInformation);
        releaseInformationMapper.insert(releaseInformation);
    }

    @Override
    public List<ReleaseInformationDTO> findAllData(Map<String, Object> params) {
        List<ReleaseInformation> releaseInformationList = releaseInformationMapper.findAll(params) ;
        List<ReleaseInformationDTO> dtoList = new ArrayList<>();
        for (ReleaseInformation releaseInformation:releaseInformationList){
            dtoList.add(transReleaseInformationToDto(releaseInformation));
        }
        return dtoList;
    }

    private ReleaseInformationDTO transReleaseInformationToDto(ReleaseInformation releaseInformation){
        ReleaseInformationDTO dto = new ReleaseInformationDTO();
        BeanUtils.copyProperties(releaseInformation,dto);
        return dto;
    }
}
