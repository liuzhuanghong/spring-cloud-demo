package com.steven.microservice.comsumer.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.steven.microservice.comsumer.entity.Student;

@RestController
public class StudentComsumerController {
	@Autowired
	private RestTemplate restTemplate;
	@Value("${student.studentServicePath}")
	private String studentServicePath;
	private final Logger logger = Logger.getLogger(getClass());
	@Autowired
	private LoadBalancerClient loadBalancerClient;

	@GetMapping("/student/{id}")
	public Student findById(@PathVariable Long id) {

		logger.info("serivceURL: " + studentServicePath + id);
		return this.restTemplate.getForObject(studentServicePath + id, Student.class);
	}

	/**
	 * 测试默认的负载均衡方法：轮巡
	 * 
	 * @return 测试使用的字符串
	 */
	@GetMapping("/testLoadBalancer")
	public String test() {
		ServiceInstance serviceInstance = this.loadBalancerClient.choose("microservice-provider-student");
		logger.info("testLoadBalancerClient:[" + serviceInstance.getServiceId() + "/" + serviceInstance.getHost() + "/"
				+ serviceInstance.getPort() + "]");
		return "success";
	}
}
