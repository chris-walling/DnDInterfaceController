package main.java.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import main.java.Model.Player;

public interface PlayerRepository extends MongoRepository<Player, String>{
	
	//public Player findById(String id);
	
	//@Query(value="{ 'Name' : ?0 }", fields="{ 'Name' : 1 }")
	public Player[] findByName(String name);
	
	public Optional<Player> findById(String id);
	
}
