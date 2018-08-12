package com.love.team.pet.wechat.service.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.love.team.pet.dao.LoginTokenMapper;
import com.love.team.pet.dao.UserMapper;
import com.love.team.pet.dao.expand.LoginTokenExpandMapper;
import com.love.team.pet.model.LoginToken;
import com.love.team.pet.wechat.service.UserTokenService;

@Service("userServiceImpl")
@Transactional
public class UserTokenSereviceImpl implements UserTokenService {
	@Autowired
	private LoginTokenExpandMapper loginTokenExpandMapper;
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public String addToken(String code) {
		//拼装url
		String url = installUrl(code);
		//调用微信webservice
		String resultJSON = sendGet(url);
		//查询微信code
		String wxCode = getWxCode(resultJSON);
		LoginToken loginToken = loginTokenExpandMapper.findWxCode(wxCode);
		//如果查询出来有对象说明不是新用户则返回token
		if(loginToken!=null) {
		return	loginToken.getUserToken();
		}else {
			//如果为null说明不存在则创建该用户对象并返回token
			//TODO 添加用户service
			return null;
		}
		
	}

	@Override
	@Transactional(readOnly = true)
	public boolean userIsRightful(String token) {
		//通过token查询该token是否在表中出现
		LoginToken loginToken = loginTokenExpandMapper.findWxCode(token);
		if(loginToken==null) {
			return false;
		}else {
			return true;
		}
	}
	
	//组装url
	private String installUrl(String code) {
		String url = "https://api.weixin.qq.com/sns/jscode2session?appid=wx7b497591dc6f5381&secret=e2e1b774e144f16001e943c6d37fb741&js_code="
				+ code + "&grant_type=authorization_code";
		return url;
	}
	
	//获取微信code
	private String getWxCode(String result) {
		JSONObject jsonObject = JSON.parseObject(result);
		// 回话秘钥,获取用户的更多信息.但是太麻烦.
		String wxKey = jsonObject.getString("session_key");
		
		// 微信的唯一ID
		String wxCode = jsonObject.getString("openid");
		
		return wxCode;
	}
	
	// 发起get请求的方法。
	private  String sendGet(String url) {
		String result = "";
		BufferedReader br = null;
		try {
			URL realUrl = new URL(url);
			URLConnection conn = realUrl.openConnection();
			conn.connect();
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

			String line;
			while ((line = br.readLine()) != null) {
				result += line;
			}
		} catch (Exception e) {
			// 异常记录
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}
}
