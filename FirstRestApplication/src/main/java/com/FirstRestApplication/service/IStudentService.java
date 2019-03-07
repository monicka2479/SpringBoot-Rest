package com.FirstRestApplication.service;

import java.util.List;

import com.FirstRestApplication.model.Student;

public interface IStudentService {
	public Student getStudentById(int studentId);
	public  List<Student> getStudentList();
}
