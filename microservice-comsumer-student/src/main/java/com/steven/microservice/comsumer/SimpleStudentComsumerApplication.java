package com.steven.microservice.comsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 学生消费类，使用默认的Ribbon实现简单的负载均衡
 * 
 * @author liuzhuanghong
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SimpleStudentComsumerApplication {
	/**
	 * 实例化RestTemplate，通过@LoadBalanced注解开启均衡负载能力.
	 * 
	 * @return restTemplate
	 */
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(SimpleStudentComsumerApplication.class, args);
	}

}
