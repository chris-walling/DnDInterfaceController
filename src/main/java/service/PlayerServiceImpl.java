package main.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.java.DAOTemplates.PlayerTemplateDAOImpl;
import main.java.Model.Player;
import main.java.exceptions.PlayerNotFoundException;

@Service
public class PlayerServiceImpl implements PlayerService{
	
	@Autowired
	private PlayerTemplateDAOImpl playerTemplateDAO;
	
	public Player getPlayerById(String id) {
		Player player = playerTemplateDAO.findOneById(id);
		if (player == null) throw new PlayerNotFoundException();
		return player;
	}
	
	
	public List<Player> getPlayersByName(String name) {
		List<Player> players = playerTemplateDAO.findByName(name);
		if (players == null) throw new PlayerNotFoundException();
		return players;
	}
	
	public Player findOneByName(String name) {
		Player player = playerTemplateDAO.findOneByName(name);
		if (player == null) throw new PlayerNotFoundException();
		return player;
	}
	
	public List<Player> getAllPlayers() {
		//return repository.findAll();
		return playerTemplateDAO.getAllPlayers();
	}
	
	public Player createPlayer(Player player) {
		//return repository.save(player);
		return playerTemplateDAO.savePlayer(player);
	}
	
	public void deletePlayer(String id) {
		playerTemplateDAO.deletePerson(id);
	}
	
	public Player updatePlayer(Player player) {
		return playerTemplateDAO.updateOnePlayer(player);
	}
	

}
