package com.app.controller;

import java.util.List;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Student;
import com.app.service.StudentService;
import com.app.studentdto.StudentAdd;

@RestController
@RequestMapping("/students")
public class StudentController {
	@Autowired
	private ModelMapper mapper;
	
	@Autowired
	private StudentService studentService;
	@GetMapping("/alldetails")
	public List<Student> getAllStudentsDetails(){
		return studentService.getAllStudentDetails();
	}
	@GetMapping("/{userId}")
	public Student getStudentById(Long id) {
		return studentService.getStudentById(id);
	}
	@PostMapping("/savedetails")
	public Student addStudentDetails(@RequestBody StudentAdd newStudent) {
		Student student=mapper.map(newStudent,Student.class);
		return studentService.addStudentDetails(student);
	}
	@DeleteMapping("/{userId}")
	public void deleteById(Long id) {
		studentService.deleteById(id);
	}

}
