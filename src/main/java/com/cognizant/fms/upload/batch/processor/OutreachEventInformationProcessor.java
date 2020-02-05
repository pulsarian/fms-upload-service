package com.cognizant.fms.upload.batch.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.cognizant.fms.upload.model.OutreachEventInformation;

@Component
public class OutreachEventInformationProcessor implements ItemProcessor<OutreachEventInformation, OutreachEventInformation> {
	
	
	
	@Override
	public OutreachEventInformation process(OutreachEventInformation oeiItem) throws Exception {
		
		return oeiItem;
	}

	

}
