package com.app.service;

import java.util.List;

import com.app.pojos.Student;

public interface StudentService {
	
	Student addStudentDetails(Student newStudent);
	List<Student> getAllStudentDetails();
	Student getStudentById(Long id);
	String deleteById(Long id);

}
