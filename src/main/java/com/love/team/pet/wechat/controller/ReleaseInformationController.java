package com.love.team.pet.wechat.controller;

import com.love.team.pet.model.wechat.dto.ReleaseInformationDTO;
import com.love.team.pet.support.Result;
import com.love.team.pet.wechat.service.ReleaseInformationService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * 发布信息
 * @author jins
 * @date on 2018/8/5.
 */
@Api("发布信息")
@RestController
@RequestMapping("//we-chat")
public class ReleaseInformationController extends BaseController {

    @Autowired
    private ReleaseInformationService releaseInformationService;

    @PostMapping("/release-information")
    public Result saveReleaseInformation(@RequestBody ReleaseInformationDTO dto){
        releaseInformationService.saveReleaseInformation(dto);
        return new Result();
    }

    @GetMapping("/release-informations")
    public Result releaseInformations(){
        Map<String,Object> params = new HashMap<>();
        releaseInformationService.findAllData(params);
        return new Result();
    }
}
