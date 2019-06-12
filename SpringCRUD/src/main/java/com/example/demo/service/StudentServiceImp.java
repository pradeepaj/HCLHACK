package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImp implements StudentService {
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void removeStudent(int id) {
		studentRepository.deleteById(id);
	}

	@Override
	public List<Student> fetchAllUser() {
	return studentRepository.findAll();
	}

	@Override
	public Student fetchStudentById(int id) {
		return studentRepository.findById(id).get();
	}

}
