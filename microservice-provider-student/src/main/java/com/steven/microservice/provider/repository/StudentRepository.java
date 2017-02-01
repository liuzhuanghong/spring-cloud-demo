package com.steven.microservice.provider.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.steven.microservice.provider.entity.Student;

/**
 * Student数据库访问类<br>
 * 简单的操作我们只须这样继承JpaRepository就可以做CRUD操作了
 * 
 * @author liuzhuanghong
 *
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
