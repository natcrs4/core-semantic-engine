package com.crs4.sem.producers;

import java.io.File;
import java.io.Serializable;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import org.neo4j.graphdb.factory.GraphDatabaseSettings;

import com.crs4.sem.config.SemEngineConfig;

import lombok.Data;

@Data
public class GraphDatabaseProducer implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private SemEngineConfig config;

	public GraphDatabaseService produces() {
		
		return new GraphDatabaseFactory().newEmbeddedDatabaseBuilder(new File(config.neo4jDirectory()))
				.setConfig(GraphDatabaseSettings.pagecache_memory, "512M")
				.setConfig(GraphDatabaseSettings.string_block_size, "60")
				.setConfig(GraphDatabaseSettings.array_block_size, "300")
				.setConfig(GraphDatabaseSettings.read_only,config.neo4jreadonly()).newGraphDatabase();

	}
	
	
}
