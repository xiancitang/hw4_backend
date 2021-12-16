package com.swe642.hw4.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swe642.hw4.model.Student;

public interface StudentRepository extends JpaRepository<Student, String> {
	Optional<Student> findById(String studentid);
}
