package main.java.entities;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import main.java.Model.Player;
import main.java.Model.Spell;

public class DnDResponseEntity<T> extends ResponseEntity<T> {

	public DnDResponseEntity(HttpStatus status) {
		super(status);
		// TODO Auto-generated constructor stub
	}
	
	public static ResponseEntity<Player> playerCreated(Player player) {
		BodyBuilder builder = status(HttpStatus.CREATED);
		return builder.body(player);
	}
	
	public static ResponseEntity<List<Player>> playerFound(List<Player> player) {
		BodyBuilder builder = status(HttpStatus.OK);
		return builder.body(player);
	}
	
	public static ResponseEntity<Player> playerFound(Player player) {
		BodyBuilder builder = status(HttpStatus.OK);
		return builder.body(player);
	}
	
	public static ResponseEntity<Player> playerUpdated(Player player) {
		BodyBuilder builder = status(HttpStatus.OK);
		return builder.body(player);
	}
	
	public static ResponseEntity<Spell> spellCreated(Spell spell) {
		BodyBuilder builder = status(HttpStatus.CREATED);
		return builder.body(spell);
	}
	
	public static ResponseEntity<List<Spell>> spellFound(List<Spell> spell) {
		BodyBuilder builder = status(HttpStatus.OK);
		return builder.body(spell);
	}
	
	public static ResponseEntity<Spell> spellFound(Spell spell) {
		BodyBuilder builder = status(HttpStatus.OK);
		return builder.body(spell);
	}

}
