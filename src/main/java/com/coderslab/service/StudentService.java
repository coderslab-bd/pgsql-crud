/**
 * 
 */
package com.coderslab.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderslab.entity.Student;
import com.coderslab.repository.StudentRepository;

/**
 * @author zubayer
 *
 */
@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;

	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}

	public List<Student> getAllSutdent() {
		return studentRepository.findAll();
	}

	public Student getByStudentId(Long id) {
		return studentRepository.findById(id).orElse(null);
	}

	public Student updateStudent(Student student) {
		return addStudent(student);
	}
}
