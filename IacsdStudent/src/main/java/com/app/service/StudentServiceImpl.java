package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojos.Student;
import com.app.repository.StudentRepository;

import om.app.Centralexception.ResourceException;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository sturepo;

	@Override
	public List<Student> getAllStudentDetails() {

		return sturepo.findAll();
	}

	@Override
	public Student AddStudent(Student student) {

		return sturepo.save(student);
	}

	@Override
	public String DeletStudent(Long id) {
		if (sturepo.existsById(id)) {
			sturepo.deleteById(id);
			return "deleted successully";
		}
		return "failed deletion";
	}

	@Override
	public Student updateStudent(Student detachedbody) {
		if (sturepo.existsById(detachedbody.getId())) {
			return sturepo.save(detachedbody);
		}
		throw new ResourceException("not found");
	}

}
