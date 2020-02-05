package com.cognizant.fms.upload.batch.reader;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.stereotype.Component;

import com.cognizant.fms.upload.model.OutreachEventInformation;

@Component
public class OutreachEventSummaryReader implements ItemReader<OutreachEventInformation> {
	/*@Bean
	    ItemReader<Student> excelStudentReader() throws MalformedURLException {
	        PoiItemReader<Student> reader = new PoiItemReader<>();
	        reader.setLinesToSkip(1);
	        reader.setResource(new FileSystemResource("D:\\Users\\847020\\Documents\\data\\OutReach Event Information.xlsx"));
	        reader.setRowMapper(excelRowMapper());
	        return reader;
	    }*/

	@Override
	public OutreachEventInformation read()
			throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		// TODO Auto-generated method stub
		return null;
	}
}

