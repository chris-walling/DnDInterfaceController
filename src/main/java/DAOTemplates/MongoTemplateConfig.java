package main.java.DAOTemplates;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

@Configuration
public class MongoTemplateConfig extends AbstractMongoConfiguration {
	
	private final String connectionURI = "mongodb://admin:Cl0udU$3r@cluster0-shard-00-00-miquc.mongodb.net:27017,cluster0-shard-00-01-miquc.mongodb.net:27017,cluster0-shard-00-02-miquc.mongodb.net:27017/test?ssl=true&replicaSet=Cluster0-shard-0&authSource=admin";

	@Override
	protected String getDatabaseName() {
		return "DnDInterface";
	}
	
	@Override
	public @Bean MongoClient mongoClient() {
		return new MongoClient(new MongoClientURI(connectionURI));
	}
	
	public @Bean MongoDbFactory mongoDbFactory() {
		return new SimpleMongoDbFactory(mongoClient(), "DnDInterface");
	}
	
	public @Bean MongoTemplate mongoTemplate() {
		return new MongoTemplate(mongoDbFactory());
	}
	
	@Override
	protected String getMappingBasePackage() {
		return "main.java.DAOTemplates";
	}
}
