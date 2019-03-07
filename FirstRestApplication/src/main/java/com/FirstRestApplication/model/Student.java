package com.FirstRestApplication.model;

public class Student {
	
	

	public Student(int studentId, String name, Double marks) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.marks = marks;
	}

	private int studentId;
	
	private String name;
	
	private Double marks;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getMarks() {
		return marks;
	}

	public void setMarks(Double marks) {
		this.marks = marks;
	}
	
	
}
