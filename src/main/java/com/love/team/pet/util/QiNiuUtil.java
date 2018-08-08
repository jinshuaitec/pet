package com.love.team.pet.util;

import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * Created by admin on 2017/4/21.
 */
public class QiNiuUtil {

    @Value("${ACCESS_KEY}")
    private static String accessKey;

    @Value("${SECRET_KEY}")
    private static String secretKey;

    @Value("${BUCKET_NAME}")
    private static String bucketName;

    @Value("${DOMAIN_BUCKET}")
    private static String domainBucket;

    private  static  final org.slf4j.Logger logger = LoggerFactory.getLogger(QiNiuUtil.class);

    //密钥配置
   private static Auth auth = Auth.create(accessKey, secretKey);
    //创建上传对象
    //构造一个带指定Zone对象的配置类
    private static Configuration cfg = new Configuration(Zone.zone0());//代表华东机房
    private static UploadManager uploadManager = new UploadManager(cfg);

    static public String upload(String filePath,String key,String bucketName) throws IOException {
        try {
            //调用put方法上传
            Response res = uploadManager.put(filePath, key, auth.uploadToken(bucketName));
            DefaultPutRet putRet = new Gson().fromJson(res.bodyString(), DefaultPutRet.class);
            String encodedFileName = URLEncoder.encode(putRet.key, "utf-8");
            return  String.format("%s/%s", domainBucket, encodedFileName);
        } catch (QiniuException e) {
            Response r = e.response;
            logger.error("error"+e);
            logger.error("r.toString()"+r.toString());
            try {
                //响应的文本信息
                logger.error("r.bodyString()"+r.bodyString());
            } catch (QiniuException e1) {
               logger.error("上传文件出错");
            }
        }
        return null;
    }

    /**
     *
     * @param bucketName//要上传的空间
     * @param key //上传到七牛后保存的文件名
     */
    public static String uploadInputStream(InputStream stream,String bucketName, String key){
        try {
            Response response = uploadManager.put(stream,key,auth.uploadToken(bucketName),null, null);
            //解析上传成功的结果
            DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
            String encodedFileName = URLEncoder.encode(putRet.key, "utf-8");
            return String.format("%s/%s", domainBucket, encodedFileName);
        } catch (QiniuException ex) {
            Response r = ex.response;
            logger.error("error"+ex);
            logger.error("r.toString()"+r.toString());
            try {
                logger.error("r.bodyString()"+r.bodyString());
            } catch (QiniuException ex2) {
                logger.error("上传文件出错");
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "";
    }
}
