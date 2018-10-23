package main.java.Model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collection = "items")
public class Item {
	
	@Id
	public String _id;
	
	@JsonProperty
	private String name;
	@JsonProperty
	private List<String> description;
	
	public Item () {}
	
	public Item(String name, List<String> description) {
		this.name = name;
		this.description = description;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getDescription() {
		return description;
	}

	public void setDescription(List<String> description) {
		this.description = description;
	}

}
