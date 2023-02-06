package com.app.service;

import java.util.List;

import javax.persistence.Id;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.custom_exception.ResourceNotFoundException;
import com.app.pojos.Student;
import com.app.repositories.StudentRepository;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepo;

	@Override
	public Student addStudentDetails(Student newStudent) {
		return studentRepo.save(newStudent);

	}

	@Override
	public List<Student> getAllStudentDetails() {
		return studentRepo.findAll();
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Details Not Found"));
	}

	@Override
	public String deleteById(Long id) {
		if (studentRepo.existsById(id)) {
			studentRepo.deleteById(id);
			return "String deleted";
		}
		return "Student not Found";
	}

}
