package com.crs4.sem.producers;

import java.io.File;
import java.io.IOException;



import org.hibernate.cfg.Configuration;

import com.crs4.sem.config.SemEngineConfig;
import com.crs4.sem.service.HibernateConfigurationFactory;
import com.crs4.sem.service.NewDocumentService;

import lombok.Data;
@Data
public class DocumentProducer {
	  
	 
	  private SemEngineConfig config;
	

	  
	  
	  
	  public NewDocumentService producer() {
		
		    String path=config.getHibernateCFGDocuments();
		    if (path.startsWith("classpath:")) {
		    	path=path.replace("classpath:", config.classpath()+"/applications/"+config.applicationame()+"/WEB-INF/classes/");
		    }
		   File cfgFile=  new File(path);
		    Configuration configure = HibernateConfigurationFactory.configureDocumentService(cfgFile);
		   
			NewDocumentService docservice= NewDocumentService.newInstance(configure);
		    return docservice;
	  }
	  

	
	
		
	}


