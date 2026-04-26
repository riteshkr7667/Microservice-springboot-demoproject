package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.CourseDto;
import com.example.demo.model.Student;
import com.example.demo.model.StudentResponse;
import com.example.demo.respository.StudentRepo;
import com.example.demo.service.StudentService;

import jakarta.transaction.Transactional;
@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepo studentRepo;
    @Autowired
    RestTemplate restTemplate;
	@Override
	public Student save(Student student) {
		return studentRepo.save(student);		
	}

	@Override
	public Optional<Student> getStudentById(int id) {
		
		return studentRepo.findById(id);
	}

	@Override
	public List<Student> getAllStudent() {
		return studentRepo.findAll();

	}

	@Override
	public String deleteStudent(int id) {
		if(studentRepo.existsById(id)) {
			studentRepo.deleteById(id);
		} else {
			return "not Found";
		}
		return "deleted";
		
	}
	@Override
	public StudentResponse getStudentWithCourse(int id) {

	    Student student = studentRepo.findById(id).orElse(null);

	    CourseDto course = restTemplate.getForObject(
	        "http://localhost:8081/getCourseByStudentId/" + id,
	        CourseDto.class
	    );

	    StudentResponse response = new StudentResponse();
	    response.setStudent(student);
	    response.setCourse(course);

	    return response;
	}
}
