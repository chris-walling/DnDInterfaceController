package main.java.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collection = "Spells")
public class Spell{


	@Id
	private String  _id;
	@JsonProperty
	private String name;
	@JsonProperty
	private String[] desc;
	@JsonProperty
	private String[] higherLevel;
	@JsonProperty
	private String page;
	@JsonProperty
	private String range;
	@JsonProperty
	private String[] components;
	@JsonProperty
	private String material;
	@JsonProperty
	private String ritual;
	@JsonProperty
	private String duration;
	@JsonProperty
	private String concentration;
	@JsonProperty
	private String casting_time;
	@JsonProperty
	private String level;
	//private School school;
	
	public Spell () {}
	
	public Spell(String _id, String name, String[] desc, String[] higherLevel, String page, String range,
			String[] components, String material, String ritual, String duration, String concentration,
			String casting_time, String level) {
		this._id = _id;
		this.name = name;
		this.desc = desc;
		this.higherLevel = higherLevel;
		this.page = page;
		this.range = range;
		this.components = components;
		this.material = material;
		this.ritual = ritual;
		this.duration = duration;
		this.concentration = concentration;
		this.casting_time = casting_time;
		this.level = level;
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
	public String[] getDesc() {
		return desc;
	}
	public void setDesc(String[] desc) {
		this.desc = desc;
	}
	public String[] getHigherLevel() {
		return higherLevel;
	}
	public void setHigherLevel(String[] higherLevel) {
		this.higherLevel = higherLevel;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public String getRange() {
		return range;
	}
	public void setRange(String range) {
		this.range = range;
	}
	public String[] getComponents() {
		return components;
	}
	public void setComponents(String[] components) {
		this.components = components;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getRitual() {
		return ritual;
	}
	public void setRitual(String ritual) {
		this.ritual = ritual;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getConcentration() {
		return concentration;
	}
	public void setConcentration(String concentration) {
		this.concentration = concentration;
	}
	public String getCasting_time() {
		return casting_time;
	}
	public void setCasting_time(String casting_time) {
		this.casting_time = casting_time;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
}
