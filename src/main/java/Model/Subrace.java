package main.java.Model;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collection = "Subraces")
public class Subrace {
	
	@JsonProperty
	private String name;

}
