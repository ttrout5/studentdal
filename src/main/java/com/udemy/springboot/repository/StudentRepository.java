package com.udemy.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.udemy.springboot.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
