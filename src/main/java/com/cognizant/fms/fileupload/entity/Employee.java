package com.cognizant.fms.fileupload.entity;

import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "employee")
public class Employee {
	
	@Id
	private Long employeeId;
	private String employeeName;
	private String businessUnit;
	private Long contactNo;
	
	
}
