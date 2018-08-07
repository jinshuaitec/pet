package com.love.team.pet.wechat.service;

import com.love.team.pet.model.wechat.dto.ReleaseInformationDTO;

import java.util.List;
import java.util.Map;

/**
 * @author jins
 * @date on 2018/8/5.
 */
public interface ReleaseInformationService {

    /**
     * 保存发布信息
     * @param dto
     */
    void saveReleaseInformation(ReleaseInformationDTO dto);

    /**
     * 查询所有数据
     * @return
     */
    List<ReleaseInformationDTO> findAllData(Map<String,Object> params);
}
