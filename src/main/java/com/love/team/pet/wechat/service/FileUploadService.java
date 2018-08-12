package com.love.team.pet.wechat.service;

import com.love.team.pet.model.FileUpload;
import com.love.team.pet.model.wechat.dto.FileUploadDTO;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author jins
 * @date on 2018/8/11.
 */
public interface FileUploadService {


    /**
     * 上传文件保存记录,返回文件名和url
     * @param file
     * @param basePath
     * @return
     */
    FileUploadDTO fileUrl(MultipartFile file, String basePath) throws IOException;
}
