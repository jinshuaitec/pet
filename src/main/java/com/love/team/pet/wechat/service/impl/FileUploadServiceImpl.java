package com.love.team.pet.wechat.service.impl;

import com.love.team.pet.dao.FileUploadMapper;
import com.love.team.pet.model.FileUpload;
import com.love.team.pet.model.wechat.dto.FileUploadDTO;
import com.love.team.pet.util.QiNiuUtil;
import com.love.team.pet.wechat.service.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author jins
 * @date on 2018/8/11.
 */
@Service("FileUploadServiceImpl")
@Transactional
public class FileUploadServiceImpl extends BaseServiceImpl<FileUpload> implements FileUploadService {

    @Autowired
    private FileUploadMapper fileUploadMapper;

    @Override
    public FileUploadDTO fileUrl(MultipartFile file, String basePath) throws IOException {
        String name = file.getOriginalFilename();
        String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        String fileName = name.substring(0,name.indexOf("."));
        String randomName = fileName + System.currentTimeMillis()+suffix;
        System.out.println(randomName);
        String urlPath = QiNiuUtil.uploadInputStream(file.getInputStream(),randomName);
        System.out.println(urlPath);
        FileUpload upload = new FileUpload();
        upload.setExt(suffix);
        upload.setName(name);
        upload.setUrl(urlPath);
        saveBasicInfo(upload);
        fileUploadMapper.insertSelective(upload);
        FileUploadDTO dto = new FileUploadDTO();
        dto.setFileName(name);
        dto.setFileUrl(urlPath);
        return dto;
    }
}
