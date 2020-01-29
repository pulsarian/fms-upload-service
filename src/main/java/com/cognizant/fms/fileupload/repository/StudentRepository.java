package com.cognizant.fms.fileupload.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.fms.fileupload.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
