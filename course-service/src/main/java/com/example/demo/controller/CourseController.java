package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Course;
import com.example.demo.service.CourseService;

@RestController
public class CourseController {

	@Autowired
	CourseService courseService;
	
	@GetMapping("/getCourseByStudentId/{id}")
	public Optional<Course> getCourseByStudentId(@PathVariable int id){
		
		return courseService.getCourseStudentId(id); 
	}
	
}
