package com.love.team.pet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.love.team.pet.util.PhoneCode;

@SpringBootApplication
@RestController
public class PetApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetApplication.class, args);
	}

	@RequestMapping(value = "/")
	public String hello() throws ServerException, ClientException{
		System.out.println(PhoneCode.phoneCode("15937431306"));
		return "Hello World";
	}
}
