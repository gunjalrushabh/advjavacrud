package com.app.service;

import java.util.List;

import com.app.pojos.Student;

public interface StudentService {

	List<Student> getAllStudentDetails();
	Student AddStudent(Student student);
	String DeletStudent(Long id);
	Student updateStudent(Student sobj);
}
