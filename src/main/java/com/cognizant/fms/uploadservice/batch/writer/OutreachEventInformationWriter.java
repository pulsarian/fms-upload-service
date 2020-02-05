package com.cognizant.fms.uploadservice.batch.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import com.cognizant.fms.uploadservice.entity.Employee;
import com.cognizant.fms.uploadservice.entity.Event;
import com.cognizant.fms.uploadservice.model.OutreachEventInformation;

@Component
public class OutreachEventInformationWriter implements ItemWriter<OutreachEventInformation> {
	
	@Override
	public void write(List<? extends OutreachEventInformation> items) throws Exception {
		
		for(OutreachEventInformation item : items) {
			
			Event event = new Event();
			Employee emp = new Employee();
			
			event.setEventId(item.getEventId());
			event.setEventName(item.getEventName());
			event.setEventDescription(item.getEventDescription());
			event.setBaseLocation(item.getBaseLocation());
			event.setBeneficiaryName(item.getBeneficiaryName());
			event.setEventDate(item.getEventDate());
			event.setLivesImpacted(item.getLivesImpacted());
			event.setCouncilName(item.getCouncilName());
			event.setStatus(item.getStatus());
			event.setIiepCategory(item.getIiepCategory());
			
			/* Save in events repo */
			
			emp.setEmployeeId(item.getEmployeeId());
			emp.setEmployeeName(item.getEmployeeName());
			emp.setBusinessUnit(item.getBusinessUnit());
			
			
			/* Save in emp repo */
		}	
	}
	
	
}

