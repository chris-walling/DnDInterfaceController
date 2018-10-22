package main.java.DAOTemplates;

import java.util.List;

import main.java.Model.Player;

public interface PlayerTemplateDAO {
	
	Player savePlayer(Player player);
	List<Player> getAllPlayers();
	Player findOneByName(String name);
	List<Player> findByName(String name);
	Player findOneById(String id);
	Player updateOnePlayer(Player player);
	void deletePerson(String id);
	
}
