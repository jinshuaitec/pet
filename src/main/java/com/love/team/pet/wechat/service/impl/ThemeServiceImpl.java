package com.love.team.pet.wechat.service.impl;

import com.love.team.pet.dao.ThemeMapper;
import com.love.team.pet.model.Theme;
import com.love.team.pet.model.wechat.dto.FabulosDTO;
import com.love.team.pet.model.wechat.dto.ThemeDTO;
import com.love.team.pet.util.DateUtil;
import com.love.team.pet.wechat.service.PagePictureService;
import com.love.team.pet.wechat.service.ThemeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author fruit
 * @date on 2018年8月10日02:51:37
 */
@Service()
@Transactional
public class ThemeServiceImpl extends BaseServiceImpl<Theme> implements ThemeService {

    @Autowired
    private ThemeMapper themeMapper;

    @Autowired
    private PagePictureService pagePictureServicer;

    @Override
    public List<Theme> list() {
        return themeMapper.findAll();
    }

    @Override
    public List<Theme> findDetailed(String theme) {
        return themeMapper.findDetailed(theme);
    }

    @Override
    public void saveTheme(ThemeDTO themeDTO) {
        Theme theme=transDTOToTheme(themeDTO);
        savemoreInfo(theme);
        themeMapper.insert(theme);
        pagePictureServicer.inster(themeDTO.getPictures());
    }

    @Override
    public List<Theme> findTheme(String time) throws ParseException {
        //调用字符串转换日期
        List<Theme> list=new ArrayList<Theme>();
        for(Theme theme:themeMapper.findTheme(DateUtil.str2Date(time,"yyyy-MM-dd HH:mm:ss"))){
            //日期转换字符串
            theme.setDate(DateUtil.formatDateTime(theme.getCreateDate()));
            list.add(theme);
        }
        return list;
    }

    @Override
    public void goodlucky(List<FabulosDTO> theme) {
        for(FabulosDTO fabulosDTO:theme){

            fabulosDTO.setTime(new Date());
        }
        themeMapper.addLuckys(theme);
    }

    /**
     * 把接收过来的user转换成dto
     * @param themeDTO
     * @return
     */
    private Theme transDTOToTheme(ThemeDTO themeDTO){
        Theme theme = new Theme();
        BeanUtils.copyProperties(themeDTO,theme);
        return theme;
    }
}
