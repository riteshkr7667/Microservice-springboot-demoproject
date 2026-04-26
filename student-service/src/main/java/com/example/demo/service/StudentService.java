package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Student;
import com.example.demo.model.StudentResponse;

public interface StudentService {

	Student save(Student student);

	Optional<Student> getStudentById(int id);

	List<Student> getAllStudent();


	String deleteStudent(int id);

	StudentResponse getStudentWithCourse(int id);

}
