package com.crs4.sem.producers;

import org.aeonbits.owner.ConfigFactory;

import com.crs4.sem.config.SemEngineConfig;



public class SemEngineConfigProducer {

	  public SemEngineConfig producer(){
		      
	           
			   return ConfigFactory.create(SemEngineConfig.class,System.getProperties(),   System.getenv());
			 } 

}
