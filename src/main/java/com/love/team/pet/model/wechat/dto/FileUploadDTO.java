package com.love.team.pet.model.wechat.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author jins
 * @date on 2018/8/11.
 */
@Data
@ApiModel(description = "文件上传返回name和url")
public class FileUploadDTO {

    @ApiModelProperty(name = "name",value = "名称",notes = "文件上传的名称")
    private String fileName;

    @ApiModelProperty(name = "url",value = "路径",notes = "文件上传的路径")
    private String fileUrl;
}
