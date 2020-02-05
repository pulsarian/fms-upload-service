package com.cognizant.fms.uploadservice.entity;

import java.sql.Date;

import javax.persistence.Entity;
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
@Table(name = "event")
public class Event {
	
	@Id
	private String eventId;
	private String eventName;
	private String eventDescription;
	private Date eventDate;
	private String baseLocation;
	private String beneficiaryName;
	private String councilName;
	private Integer livesImpacted;
	private String status;
	private String iiepCategory;
	private String project;
	private String month;
	private String address;
	private String category;
	private String totalVolunteers;
	private Float volunteerHours;
	private Float travelHours;
	private Double overallVolunteeringHours;
	private String activityType;
	private String city;
	private String country;

}