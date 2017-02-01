package com.steven.microservice.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.steven.microservice.provider.entity.Student;
import com.steven.microservice.provider.repository.StudentRepository;

@RestController
public class StudentController {
	@Autowired
	private StudentRepository studentRepository;

	/**
	 * 根据学生ID获取学生的学生类信息对象
	 * 
	 * @param id
	 *            学生ID
	 * @return 学生类信息对象
	 */
	@GetMapping("/student/{id}")
	// @GetMapping("/{id}")是spring 4.3的新注解等价于：
	// @RequestMapping(value = "/id", method = RequestMethod.GET)
	public Student findById(@PathVariable Long id) {
		// replacing studentRepository.getOne(id) method call with
		// studentRepository.findOne(id) problem was gone.
		return studentRepository.findOne(id);
	}

	/**
	 * 根据学生ID获取学生的学生类信息对象
	 * 
	 * @param id
	 *            学生ID
	 * @return 学生类信息对象
	 */
	@GetMapping("/version")
	public String getVersion() {
		return "0.0.1";
	}
}
