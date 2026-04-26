package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Student;
import com.example.demo.model.StudentResponse;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@PostMapping("/save")
	public String saveStudent(@RequestBody Student student) {
		studentService.save(student);
		return "saved";
	}
	
	@GetMapping("/getStudentById/{id}")
	public Optional<Student> getStudent(@PathVariable int id){
	    return studentService.getStudentById(id);
	}
	
	@GetMapping("/getAllStudent")
	public List<Student> getStudent(){
	    return studentService.getAllStudent();
	}
	@DeleteMapping("/deleteById/{id}")
	public String deleteStudentdetails(@PathVariable int id) {
		return studentService.deleteStudent(id);
	}
	
	@GetMapping("/studentWithCourse/{id}")
	public StudentResponse getStudentWithCourse(@PathVariable int id) {
	    return studentService.getStudentWithCourse(id);
	}
}
