package main.java.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import main.java.Model.Player;

public interface PlayerRepository extends MongoRepository<Player, String>{
	
	//public Player findById(String id);
	
	@Query(value="{ 'Name' : ?0 }", fields="{ 'Name' : 1 }")
	public Player findByName(String name);
	
}
