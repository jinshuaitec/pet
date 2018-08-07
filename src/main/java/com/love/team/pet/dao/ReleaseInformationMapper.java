package com.love.team.pet.dao;

import com.love.team.pet.model.ReleaseInformation;

import java.util.List;
import java.util.Map;

public interface ReleaseInformationMapper extends BaseMapper<ReleaseInformation>{

    /**
     * 查询所有数据
     * @param params
     * @return
     */
    List<ReleaseInformation> findAllData(Map<String,Object> params);
}