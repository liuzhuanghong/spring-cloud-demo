package com.steven.microservice.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 服务发现模块
 * 
 * @author liuzhuanghong
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class DiscoveryEurekaApplication {

	public static void main(String[] args) {
		// 如果运行时出现找不到包的情况，可以是包下载不全，可以重复执行mvn clean install -U，直到正确下载依赖
		SpringApplication.run(DiscoveryEurekaApplication.class, args);
	}

}
