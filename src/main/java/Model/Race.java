package main.java.Model;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collection = "Races")
public class Race {

	@JsonProperty("name")
	private String name;
	@JsonProperty("age")
	private String age;
	@JsonProperty("alignment")
	private String alignment;
	@JsonProperty("size")
	private String size;
	@JsonProperty("speed")
	private int speed;
	@JsonProperty("languages")
	private String[] languages;
		//to-do
		//make a subrace class
	//private Subrace[] subraces;
	//ability score increase????
	private Trait[] traits;
	
	public Race () {}
	
	public Race(String name, String age, String alignment, String size, int speed, String[] languages,
			Trait[] traits) {
		this.name = name;
		this.age = age;
		this. alignment = alignment;
		this.size = size;
		this.speed = speed;
		this.languages = languages;
		this.traits = traits;
	}
	
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAlignment() {
		return alignment;
	}
	public void setAlignment(String alignment) {
		this.alignment = alignment;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String[] getLanguages() {
		return languages;
	}
	public void setLanguages(String[] languages) {
		this.languages = languages;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Trait[] getTraits() {
		return traits;
	}

	public void setTraits(Trait[] traits) {
		this.traits = traits;
	}
	
}
