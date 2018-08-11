
package com.love.team.pet.wechat.controller;

import com.love.team.pet.model.wechat.dto.FileUploadDTO;
import com.love.team.pet.support.JSONResult;
import com.love.team.pet.wechat.service.FileUploadService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jins
 * @date 2017/8/31
 * 上传文件控制器
 */
@Api(value = "FileUploadController", description = "文件上传")
@RestController
public class FileUploadController extends BaseController{

    @Autowired
    private FileUploadService fileUploadService;

    @ApiOperation(value = "文件列表上传")
    @RequestMapping(value = "/upload-files", method = RequestMethod.POST)
    public JSONResult uploadFiles(HttpServletRequest request, @RequestParam(value = "file") MultipartFile... fileList) throws IOException {
        List<FileUploadDTO> fileUploadDTOList = new ArrayList<>();
        for (MultipartFile file : fileList) {
            FileUploadDTO fileUploadDTO = fileUploadService.fileUrl(file, fileUrl(request));
            fileUploadDTOList.add(fileUploadDTO);
        }
        return new JSONResult(fileUploadDTOList);
    }

    @ApiOperation(value = "单文件上传")
    @RequestMapping(value = "/upload-file", method = RequestMethod.POST)
    public JSONResult uploadFile(@RequestParam(value = "file") MultipartFile file, HttpServletRequest request) throws Exception {
        FileUploadDTO dto = fileUploadService.fileUrl(file,fileUrl(request) );
        return new JSONResult(dto);
    }
}
