package com.cognizant.fms.fileupload.config;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cognizant.fms.fileupload.entity.Student;
import com.cognizant.fms.fileupload.repository.StudentRepository;


@Component
public class Writer implements ItemWriter<Student> {

	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public void write(List<? extends Student> students) throws Exception {
		for(Student student: students) {
			//studentRepository.save(student);
			System.out.println(student);
		}
	}

	
}