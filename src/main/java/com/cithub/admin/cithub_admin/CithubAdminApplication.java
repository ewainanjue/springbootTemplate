package com.cithub.admin.cithub_admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.cithub.admin.cithub_admin.mapper")
public class CithubAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(CithubAdminApplication.class, args);
	}

}
