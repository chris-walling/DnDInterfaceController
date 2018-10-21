package main.java.Model;

public class Spell{
	
//	private String spellName;
//	private String description;
//	private String higherLevel;
//	private String range;
//	private String ritual;
//	private String concentration;
//	private String castingTime;
//	private int level;
//	private String school; //superclass of School, with subclasses?
//	private String[] classes; //make class objects, can be array of Classes
	private String  _id;
	private String index;
	private String name;
	private String[] desc;
	private String[] higherLevel;
	private String page;
	private String range;
	private String[] components;
	private String material;
	private String ritual;
	private String duration;
	private String concentration;
	private String casting_time;
	private String level;
	//private School school;
	//private Class[] classes;
	//private SubClass[] subclasses;
	private String url;
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getIndex() {
		return index;
	}
	public void setIndex(String index) {
		this.index = index;
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	

}
