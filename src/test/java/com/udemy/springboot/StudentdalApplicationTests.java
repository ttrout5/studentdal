package com.udemy.springboot;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.udemy.springboot.entity.Student;
import com.udemy.springboot.repository.StudentRepository;

@SpringBootTest
class StudentdalApplicationTests {

	@Autowired
	private StudentRepository studentRepository;

	@Test
	public void shouldCreateStudent() {

		Student student = new Student();
		student.setName("John");
		student.setCourse("Java Web Services");
		student.setFee(30d);

		studentRepository.save(student);

	}

	@Test
	public void shouldFindStudentById() {

		Optional<Student> studentOptional = studentRepository.findById(1L);

		if (studentOptional.isPresent()) {
			Student student = studentOptional.get();

			System.out.println(student);
		}
	}

	@Test
	public void shouldUpdateStudent() {

	}

}
