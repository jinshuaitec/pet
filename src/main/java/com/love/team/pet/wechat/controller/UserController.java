package com.love.team.pet.wechat.controller;

import com.love.team.pet.model.wechat.dto.UserDTO;
import com.love.team.pet.support.Result;
import com.love.team.pet.wechat.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 用户信息
 * @author jins
 * @date on 2018/8/5.
 */
@Api("用户信息")
@RestController
@RequestMapping("/we-chat")
public class UserController  extends BaseController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    @ApiOperation(value = "保存用户信息",notes = "请注意做必填验证")
    public Result save(@RequestBody UserDTO userDTO){
        userService.save(userDTO);
        return new Result();
    }

}
