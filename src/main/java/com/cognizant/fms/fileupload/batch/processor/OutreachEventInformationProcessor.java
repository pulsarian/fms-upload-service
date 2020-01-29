package com.cognizant.fms.fileupload.batch.processor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.cognizant.fms.fileupload.entity.Employee;
import com.cognizant.fms.fileupload.entity.Event;
import com.cognizant.fms.fileupload.model.OutreachEventInformation;

@Component
public class OutreachEventInformationProcessor implements ItemProcessor<OutreachEventInformation, OutreachEventInformation> {
	
	private List<Event> events = new ArrayList<>();
	private List<Employee> employees = new ArrayList<>();
	
	@Override
	public OutreachEventInformation process(OutreachEventInformation oeiItem) throws Exception {
		
		Event event = new Event();
		Employee emp = new Employee();
		
		event.setEventId(oeiItem.getEventId());
		event.setEventName(oeiItem.getEventName());
		event.setEventDescription(oeiItem.getEventDescription());
		event.setBaseLocation(oeiItem.getBaseLocation());
		event.setBeneficiaryName(oeiItem.getBeneficiaryName());
		event.setEventDate(oeiItem.getEventDate());
		event.setLivesImpacted(oeiItem.getLivesImpacted());
		event.setCouncilName(oeiItem.getCouncilName());
		event.setBusinessUnit(oeiItem.getBusinessUnit());
		event.setStatus(oeiItem.getStatus());
		event.setIiepCategory(oeiItem.getIiepCategory());
		
		events.add(event);
		//Save in repo
		
		emp.setEmployeeId(oeiItem.getEmployeeId());
		emp.setEmployeeName(oeiItem.getEmployeeName());
		emp.setTravelHours(oeiItem.getTravelHours());
		emp.setVolunteerHours(oeiItem.getVolunteerHours());
		
		employees.add(emp);
		//save in repo
		return oeiItem;
	}

	

}
