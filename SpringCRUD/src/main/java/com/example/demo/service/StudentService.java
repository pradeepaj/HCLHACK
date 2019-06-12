package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService {

	Student saveStudent(Student student);

	 void removeStudent(int id);

	List<Student> fetchAllUser();

	Student fetchStudentById(int id);

}
