package com.mient.teamolab.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

@Configuration
@EnableMongoRepositories(basePackages = "com.mient.teamolab.repositories")
public class MongoConfiguration extends AbstractMongoConfiguration{

	@Override
	protected String getDatabaseName() {
		return "teamo";
	}

	@Override
	public Mongo mongo() throws Exception {
		return new MongoClient("127.0.0.1:27017");
	}

	@Override
	protected String getMappingBasePackage() {
		return "com.mient.teamolab";
	}
}
