package com.cognizant.fms.fileupload.config;



import java.net.MalformedURLException;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.excel.RowMapper;
import org.springframework.batch.item.excel.mapping.BeanWrapperRowMapper;
import org.springframework.batch.item.excel.poi.PoiItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.fms.fileupload.batch.processor.OutreachEventInformationProcessor;
import com.cognizant.fms.fileupload.batch.reader.OutreachEventInformationReader;
import com.cognizant.fms.fileupload.entity.Student;
import com.cognizant.fms.fileupload.mapper.StudentRowMapper;

@Configuration
@EnableBatchProcessing
@Transactional
public class BatchConfig {
	
	@Autowired
	  public JobBuilderFactory jobBuilderFactory;

	@Autowired
    private StepBuilderFactory stepBuilderFactory;
	
	@Autowired
	private OutreachEventInformationReader oeiReader;
	
	@Autowired
	private OutreachEventInformationProcessor oeiProcessor;
		
	  public Job readFirstExcel() {
	    return jobBuilderFactory.get("reading-excel-files")
	                            .incrementer(new RunIdIncrementer())
	                            .start(readOutreachEventInformation())
	                            .next(readOutreachEventSummary())
	                            .next(readNotAttendedVolunteerDetails())
	                            .next(readUnregisteredVolunteerDetails())	                         
	                            .build();
	  }
	  

	  @Bean
	    public Step readOutreachEventInformation() {
	        return stepBuilderFactory.get("read-outreach-event-information")
	        		.chunk(100).reader(oeiReader)
	        		//.processor((e)->Process(oeiProcessor)
	        		.build();
	    }
	  
	  @Bean
	    public Step readOutreachEventSummary() {
	        return stepBuilderFactory.get("read-outreach-event-summary")
	                                    .tasklet((contribution, chunkContext) -> null)
	                                    .build();
	    }
	  @Bean
	    public Step readNotAttendedVolunteerDetails() {
	        return stepBuilderFactory.get("read-not-attended-volunteer-details")
	                                    .tasklet((contribution, chunkContext) -> null)
	                                    .build();
	    }
	  @Bean
	    public Step readUnregisteredVolunteerDetails() {
	        return stepBuilderFactory.get("read-unregistered-volunteer-details")
	                                    .tasklet((contribution, chunkContext) -> null)
	                                    .build();
	    }
	  
	  /*
	@Bean
    public Job job(JobBuilderFactory jobBuilderFactory, 
    		StepBuilderFactory stepBuilderFactory, 
    		ItemReader<Student> excelStudentReader, 
    		ItemProcessor<Student, Student> itemProcessor, 
    		ItemWriter<Student> itemWriter) {

        Step step = stepBuilderFactory.get("ETL-file-load")
                .<Student, Student>chunk(100)
                .reader(excelStudentReader)
                .processor(itemProcessor)
                .writer(itemWriter)
                .build();


        return jobBuilderFactory.get("ETL-Load")
                .incrementer(new RunIdIncrementer())
                .start(step)
                .build();
    }
	
	
	
	*/
	
	
	@Bean
    ItemReader<Student> excelStudentReader() throws MalformedURLException {
        PoiItemReader<Student> reader = new PoiItemReader<>();
        reader.setLinesToSkip(1);
        reader.setResource(new FileSystemResource("D:\\Users\\847020\\Documents\\data\\OutReach Event Information.xlsx"));
        reader.setRowMapper(excelRowMapper());
        return reader;
    }
	
	private RowMapper<Student> excelRowMapper() {
        BeanWrapperRowMapper<Student> rowMapper = new BeanWrapperRowMapper<>();
        rowMapper.setTargetType(Student.class);
        return rowMapper;
    }
	
	
	
}
