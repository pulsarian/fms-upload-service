package com.cognizant.fms.uploadservice.mapper;

import org.springframework.batch.item.excel.RowMapper;
import org.springframework.batch.item.excel.support.rowset.RowSet;

import com.cognizant.fms.uploadservice.entity.Student;

public class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(RowSet row) throws Exception {
		System.out.println(row.getCurrentRowIndex());
		System.out.println(row.getProperties());
		System.out.println(row.getProperties().getProperty("purchased_package"));
		System.out.println(row.getMetaData().getColumnName(0));
		System.out.println(row.getCurrentRow());
		
		
		
		
		Student student = new Student();
		student.setStudentId((long)Double.parseDouble(row.getProperties().getProperty("student_id")));
		student.setStudentName(row.getProperties().getProperty("student_name"));
		student.setStudentEmail(row.getProperties().getProperty("student_email"));
		student.setPurchasedPackage(row.getProperties().getProperty("purchased_package"));
		
		return student;
	}

}
