package com.steven.microservice.comsumer.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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

	@GetMapping("/student/{id}")
	public Student findById(@PathVariable Long id) {
		logger.info("serivceURL: " + studentServicePath + id);
		return this.restTemplate.getForObject(studentServicePath + id, Student.class);
	}
}
