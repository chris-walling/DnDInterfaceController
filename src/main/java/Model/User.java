package main.java.Model;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collection = "users")
public class User {
	
	@JsonProperty
	private String uid;
	@JsonProperty
	private String[] players;
	
	public User() {}
	
	public User(String uid, String[] players) {
		this.uid = uid;
		this.players = players;
	}
	
	public String getUid() {
		return uid;
	}
	public void setPid(String uid) {
		this.uid = uid;
	}

	public String[] getPlayers() {
		return players;
	}

	public void setPlayers(String[] players) {
		this.players = players;
	}

}
