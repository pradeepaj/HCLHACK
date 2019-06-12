package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping("/CreateStudent")
	public Student studentCreate(@RequestBody Student student) {
		Student s1 = studentService.saveStudent(student);
		return s1;

	}

	@DeleteMapping("/studentDelete/{id}")
	public void studentDelete(@PathVariable int id) {
		studentService.removeStudent(id);

	}

	@GetMapping("/getAllStudent")
	public List<Student> getAllStudent() {
		return studentService.fetchAllUser();
	}
	@GetMapping("/getStudentById/{id}")
	public Student getStudentById(@PathVariable int id) {
		return studentService.fetchStudentById(id);
	}

}
