package com.crs4.sem.producers;

import java.io.File;

import org.hibernate.cfg.Configuration;

import com.crs4.sem.config.SemEngineConfig;
import com.crs4.sem.service.HibernateConfigurationFactory;
import com.crs4.sem.service.ShadoService;



public class ShadoServiceProducer {
	 
	  private SemEngineConfig config;
	
	 
	
	  public ShadoService producer() {
		
		  String path=config.getHibernateCFGShado();
		    if (path.startsWith("classpath:")) {
		    	path=path.replace("classpath:", config.classpath()+"/applications/"+config.applicationame()+"/WEB-INF/classes/");
		    }
		   File cfgFile=  new File(path);
		    Configuration configure = HibernateConfigurationFactory.configureShadoService(cfgFile);
			ShadoService shadoService=  ShadoService.newInstance(configure);

		    
		    return shadoService;
	  }
	  


}
