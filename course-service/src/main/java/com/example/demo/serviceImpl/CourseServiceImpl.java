package com.example.demo.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Course;
import com.example.demo.repo.CourseRepo;
import com.example.demo.service.CourseService;

import jakarta.transaction.Transactional;
@Service
@Transactional
public class CourseServiceImpl implements CourseService {

	@Autowired
	CourseRepo courseRepo;
	@Override
	public Optional<Course> getCourseStudentId(int id) {
		return courseRepo.findByStudentId(id);
	}

}
