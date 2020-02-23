package com.crs4.sem.producers;

import java.io.File;
import java.io.IOException;



import org.aeonbits.owner.ConfigFactory;

import com.crs4.sem.config.SemEngineConfig;
import com.crs4.sem.service.DocumentService;
import com.crs4.sem.service.NERService;

import lombok.Data;

@Data
public class NERProducer {
	
	  private SemEngineConfig config;

	
	public NERService producer() throws IOException {
		
		File file = new File(config.icabparameters());
		return new NERService(file);
	}
}
