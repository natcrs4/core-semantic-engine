package com.crs4.sem.producers;

import java.io.IOException;

import org.apache.lucene.analysis.Analyzer;

import com.crs4.sem.config.SemEngineConfig;
import com.crs4.sem.service.LuceneService;

import lombok.Data;


@Data
public class LuceneServiceProducer {

	 private SemEngineConfig config;

	private Analyzer analyzer;
	

    public LuceneService producer(){
	   String source=config.indexbase()+"/com.crs4.sem.model.NewDocument";
		LuceneService luceneService=null;
		try {
			luceneService =  LuceneService.newInstance(source);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return luceneService;
	}
	
}
