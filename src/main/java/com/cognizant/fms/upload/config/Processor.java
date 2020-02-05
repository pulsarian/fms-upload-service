package com.cognizant.fms.upload.config;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.cognizant.fms.upload.entity.Student;



@Component
public class Processor implements ItemProcessor<Student, Student> {
	
	
	@Override
	public Student process(Student student) throws Exception {
		
		String name = student.getStudentName();
		String processed_name = name.concat("_processed");
		System.out.println(processed_name);
		
		return student;
	}

}