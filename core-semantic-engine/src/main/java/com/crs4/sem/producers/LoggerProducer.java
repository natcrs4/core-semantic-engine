package com.crs4.sem.producers;

import java.util.logging.Logger;

public class LoggerProducer {

	 
	  public Logger producer(String classname){
		 
			   return Logger.getLogger(classname); // or sth similar, depends on your implementation  
			 } 
	}