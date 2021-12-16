package com.swe642.hw4.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.swe642.hw4.model.Student;
import com.swe642.hw4.repository.StudentRepository;

@CrossOrigin(origins = "*")

@RestController
@RequestMapping("/api")
public class StudentController  {

	@Autowired
	StudentRepository studentRepository;

	@GetMapping("/students")
	public ResponseEntity<List<Student>> getAllStudents() {
		try {
			List<Student> students = new ArrayList<Student>();

			studentRepository.findAll().forEach(students::add);

			if (students.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(students, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/students/{studentid}")
	public ResponseEntity<Student> getStudentById(@PathVariable("studentid") String studentid) {
		Optional<Student> studentData = studentRepository.findById(studentid);

		if (studentData.isPresent()) {
			return new ResponseEntity<>(studentData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/student")
	public ResponseEntity<Student> createStudent(@RequestBody Student student) {
		try {
			Student _student = studentRepository
					.save(new Student(student.getStudentid(), student.getFirstName(),student.getLastName(),student.getEmail(),student.getPhone(),
							student.getAddress(),student.getCity(),student.getState(),student.getZipcode(),student.getDateofsurvey(),student.getHighschoolmonth(),
							student.getHighschoolyear(),student.getThingslikegmu(),student.getWaytoknowgmu(),student.getRecommend(),student.getComments()));
			return new ResponseEntity<>(_student, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}