package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Student;
import com.app.service.StudentService;


@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
private StudentService stuservice;
@GetMapping
public List<Student> getAlStudent(){
	return stuservice.getAllStudentDetails();
}

@PostMapping
public Student addStudent(@RequestBody Student stu)
{
return stuservice.AddStudent(stu);	
}

@DeleteMapping("/{sid}")
public String deleteStudentDetails(@PathVariable Long sid)
{
	return stuservice.DeletStudent(sid);
	
}


@PutMapping
public Student updateStudent(@RequestBody Student sobj)
{

	return stuservice.updateStudent(sobj);
}
}
