package com.love.team.pet.wechat.controller;

import com.love.team.pet.model.wechat.dto.ReleaseInformationDTO;
import com.love.team.pet.support.JSONResult;
import com.love.team.pet.support.Result;
import com.love.team.pet.wechat.service.ReleaseInformationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
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
    @ApiOperation(value = "保存发布信息")
    public Result saveReleaseInformation(@RequestBody ReleaseInformationDTO dto){
        releaseInformationService.saveReleaseInformation(dto);
        return new Result();
    }

    @GetMapping("/release-informations")
    @ApiOperation(value = "获取多个发布信息")
    public JSONResult releaseInformationMore(){
        Map<String,Object> params = new HashMap<>();
        List<ReleaseInformationDTO> dtoList =  releaseInformationService.findAllData(params);
        return new JSONResult(dtoList);
    }
}
