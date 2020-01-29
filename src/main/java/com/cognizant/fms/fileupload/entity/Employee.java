package com.cognizant.fms.fileupload.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private Long employeeId;
	private String employeeName;
	private Double volunteerHours;
	private Double travelHours;
	
	public Employee() {}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Double getVolunteerHours() {
		return volunteerHours;
	}

	public void setVolunteerHours(Double volunteerHours) {
		this.volunteerHours = volunteerHours;
	}

	public Double getTravelHours() {
		return travelHours;
	}

	public void setTravelHours(Double travelHours) {
		this.travelHours = travelHours;
	}

	public Employee(Long employeeId, String employeeName, Double volunteerHours, Double travelHours) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.volunteerHours = volunteerHours;
		this.travelHours = travelHours;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", volunteerHours="
				+ volunteerHours + ", travelHours=" + travelHours + "]";
	}

	
}
