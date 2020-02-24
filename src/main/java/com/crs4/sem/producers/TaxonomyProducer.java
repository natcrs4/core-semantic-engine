package com.crs4.sem.producers;

import java.io.IOException;

import org.neo4j.graphdb.GraphDatabaseService;

import com.crs4.sem.config.SemEngineConfig;
import com.crs4.sem.neo4j.service.TaxonomyService;

import lombok.Data;


@Data
public class TaxonomyProducer {


	private SemEngineConfig config;

	private GraphDatabaseService service;

	
	public TaxonomyService producer() throws IOException {
		TaxonomyService taxoservice = new TaxonomyService(service);
		return taxoservice;
	}

}
