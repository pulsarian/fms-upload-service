package com.cognizant.fms.uploadservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.fms.uploadservice.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
