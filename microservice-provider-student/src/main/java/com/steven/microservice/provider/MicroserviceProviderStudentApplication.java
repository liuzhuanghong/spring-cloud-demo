package com.steven.microservice.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 学生微服务实例
 * 
 * @author liuzhuanghong
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class MicroserviceProviderStudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceProviderStudentApplication.class, args);
	}

}
