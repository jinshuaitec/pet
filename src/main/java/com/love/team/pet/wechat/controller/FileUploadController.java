
package com.love.team.pet.wechat.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author zhagnzhi
 * @date 2017/8/31
 * 上传文件控制器
 */
@Api(value = "FileUploadController", description = "文件上传")
@RequestMapping("/file-upload")
@RestController
public class FileUploadController {

  /*  @Autowired
    private IFileUploadService fileUploadService;

    @ApiOperation(value = "上传文件")
    @RequestMapping(value = "/uploadfile",method = RequestMethod.POST)
    public Result uploadImage(@RequestParam(value = "file") MultipartFile file) throws Exception {
        String name = file.getOriginalFilename();
        String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        String fileName = name.substring(0,name.indexOf("."));
        String number = fileName + System.currentTimeMillis()+suffix ;
        String urlPath = QiniuUtil.uploadInputStream(file.getInputStream(), Constants.HOUSING_PARTY_CONSTRUCTION,number);
        FileUpload upload = new FileUpload();
        upload.setCategory(this.getClass().getSimpleName());
        upload.setExt(suffix);
        upload.setFileName(name);
        upload.setPath(urlPath);
        fileUploadService.saveOrUpdate(upload);
        FileUploadDto dto = new FileUploadDto();
        dto.setFileName(name);
        dto.setFilePath(urlPath);
        return new JSONResult(dto);
    }

    @ApiOperation(value = "单文件上传")
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public Result uploadFile(@RequestParam(value = "file") MultipartFile file, HttpServletRequest request) throws Exception {
        String basePath = request.getSession().getServletContext().getRealPath("/");
        FileUploadDto dto = fileUploadService.filePath(file, basePath);
        return new JSONResult(dto);
    }*/
}
