package com.FirstRestApplication.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FirstRestApplication.model.Student;
import com.FirstRestApplication.service.IStudentService;

@RestController
public class StudentController {
	
	@Autowired
	IStudentService  studentService;
	
	@RequestMapping("/student/search/{studentId}")
	public Student findStudent(@PathVariable int studentId){
		return studentService.getStudentById(studentId);
	}
	
	

}
