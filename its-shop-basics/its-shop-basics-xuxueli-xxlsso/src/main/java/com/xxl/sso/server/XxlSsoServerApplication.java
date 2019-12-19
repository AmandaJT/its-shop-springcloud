package com.xxl.sso.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author xuxueli 2018-03-22 23:41:47
 */
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)//忽略数据源
public class XxlSsoServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(XxlSsoServerApplication.class, args);
	}

}