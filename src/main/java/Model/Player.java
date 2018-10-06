package main.java.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collection = "Players")
public class Player {
	
	@Id
	public String id;
	
	@JsonProperty("spells")
	public String[] spells;
	@JsonProperty("items")
	public String[] items;
	public String name;
	public String charClass;
	
	@JsonProperty("stats")
	public Stats stats;
	
	public Player() {}
	
	public Player(String[] spells, String[] items, String name, String charClass,
			Stats stats) {
		this.spells = spells;
		this.items = items;
		this.name = name;
		this.charClass = charClass;
		this.stats = stats;
	}
	
	@Override
	public String toString() {
		return String.format("Player[Name=%s, Class=%s]", name, charClass);
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String[] getSpells() {
		return spells;
	}

	public void setSpells(String[] spells) {
		this.spells = spells;
	}

	public String[] getItems() {
		return items;
	}

	public void setItems(String[] items) {
		this.items = items;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCharClass() {
		return charClass;
	}

	public void setCharClass(String charClass) {
		this.charClass = charClass;
	}

	public Stats getStats() {
		return stats;
	}

	public void setStats(Stats stats) {
		this.stats = stats;
	}
	
	

}
