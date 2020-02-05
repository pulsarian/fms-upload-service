package com.cognizant.fms.uploadservice.batch.reader;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.batch.item.excel.RowMapper;
import org.springframework.batch.item.excel.mapping.BeanWrapperRowMapper;
import org.springframework.batch.item.excel.poi.PoiItemReader;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;

import com.cognizant.fms.uploadservice.entity.Student;
import com.cognizant.fms.uploadservice.model.OutreachEventInformation;

@Component
public class OutreachEventInformationReader implements ItemReader<OutreachEventInformation> {
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
		PoiItemReader<OutreachEventInformation> reader = new PoiItemReader<>();
		reader.setLinesToSkip(1);
        reader.setResource(new FileSystemResource("D:\\Users\\847020\\Documents\\data\\OutReach Event Information.xlsx"));
        reader.setRowMapper(excelRowMapper());
        return reader.read();
	}
	
	
	private RowMapper<OutreachEventInformation> excelRowMapper() {
        BeanWrapperRowMapper<OutreachEventInformation> rowMapper = new BeanWrapperRowMapper<>();
        rowMapper.setTargetType(OutreachEventInformation.class);
        return rowMapper;
    }
	
}

