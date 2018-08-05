package com.love.team.pet.wechat.service.impl;

import com.love.team.pet.base.Base;
import com.love.team.pet.model.BaseEntity;

import java.util.Date;
import java.util.UUID;

/**
 * @author jins
 * @date on 2018/4/25.
 */
public abstract class BaseServiceImpl<T extends BaseEntity> extends Base {

    /**
     * 保存时设置基础属性的方法（只设置创建者和更新人）
     * UUID由系统自动维护，不用设置
     * 创建/更新时间有默认值，不用设置
     *
     * @param baseEntity 待保存对象
     */
    protected void saveBasicInfo(BaseEntity baseEntity) {
        baseEntity.setId(UUID.randomUUID().toString());
        baseEntity.setCreateBy("");
        baseEntity.setCreateDate(new Date());
        baseEntity.setDeleted(false);
    }
}
