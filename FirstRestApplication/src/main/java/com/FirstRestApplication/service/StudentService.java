package com.FirstRestApplication.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.FirstRestApplication.model.Student;

@Service
public class StudentService implements IStudentService{
	List<Student> studentLists ;
	public Student getStudentById(int studentId){
		studentLists = getStudentList();
		return studentLists.get(studentId);
	}
	
	
	public  List<Student> getStudentList(){
		List<Student> studentLists = new ArrayList<>();
		Student student1=new Student(1,"Raj",200.00);
		Student student2=new Student(2,"Ram",300.00);
		Student student3=new Student(3,"Kumar",400.00);
		Student student4=new Student(4,"Santhosh",500.00);
		studentLists.add(student1);
		studentLists.add(student2);
		studentLists.add(student3);
		studentLists.add(student4);
		return studentLists;
	}
}
