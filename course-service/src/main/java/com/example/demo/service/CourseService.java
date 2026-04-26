package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Course;

public interface CourseService {

	Optional<Course> getCourseStudentId(int id);

}
