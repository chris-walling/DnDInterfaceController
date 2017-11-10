package main.java.repository;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

@Configuration
@EnableMongoRepositories
public class ApplicationConfig extends AbstractMongoConfiguration {
	
	private String connectionURI = "mongodb://admin:Cl0udU$3r@cluster0-shard-00-00-miquc.mongodb.net:27017,cluster0-shard-00-01-miquc.mongodb.net:27017,cluster0-shard-00-02-miquc.mongodb.net:27017/test?ssl=true&replicaSet=Cluster0-shard-0&authSource=admin";
	
	@Override
	protected String getDatabaseName() {
		return "DnDInterface";
	}
	
	@Override
	public MongoClient mongo() {
		MongoClientURI uri = new MongoClientURI(connectionURI);
		return new MongoClient(uri);
	}
	
	@Override
	protected String getMappingBasePackage() {
		return "main.java.repository";
	}
}
