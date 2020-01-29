package com.cognizant.fms.fileupload.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
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
	private String businessUnit;
	
	public Event() {}
	
	public String getEventId() {
		return eventId;
	}
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getEventDescription() {
		return eventDescription;
	}
	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}
	public Date getEventDate() {
		return eventDate;
	}
	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}
	public String getBaseLocation() {
		return baseLocation;
	}
	public void setBaseLocation(String baseLocation) {
		this.baseLocation = baseLocation;
	}
	public String getBeneficiaryName() {
		return beneficiaryName;
	}
	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}
	public String getCouncilName() {
		return councilName;
	}
	public void setCouncilName(String councilName) {
		this.councilName = councilName;
	}
	public Integer getLivesImpacted() {
		return livesImpacted;
	}
	public void setLivesImpacted(Integer livesImpacted) {
		this.livesImpacted = livesImpacted;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getIiepCategory() {
		return iiepCategory;
	}
	public void setIiepCategory(String iiepCategory) {
		this.iiepCategory = iiepCategory;
	}
	public String getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}
	public Event(String eventId, String eventName, String eventDescription, Date eventDate, String baseLocation,
			String beneficiaryName, String councilName, Integer livesImpacted, String status, String iiepCategory,
			String businessUnit) {
		super();
		this.eventId = eventId;
		this.eventName = eventName;
		this.eventDescription = eventDescription;
		this.eventDate = eventDate;
		this.baseLocation = baseLocation;
		this.beneficiaryName = beneficiaryName;
		this.councilName = councilName;
		this.livesImpacted = livesImpacted;
		this.status = status;
		this.iiepCategory = iiepCategory;
		this.businessUnit = businessUnit;
	}
	
	
	
}
