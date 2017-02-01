package com.steven.microservice.comsumer.entity;

/**
 * 学生实体类
 * @author liuzhuanghong
 *
 */
public class Student {
	public Student(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Student() {
		super();
	}

	private Long id;
	private String name;
	private Short age;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Short getAge() {
		return age;
	}

	public void setAge(Short age) {
		this.age = age;
	}

}
