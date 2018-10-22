package main.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.java.DAOTemplates.PlayerTemplateDAOImpl;
import main.java.Model.Player;
import main.java.exceptions.PlayerNotFoundException;
import main.java.repository.PlayerRepository;

@Service
public class PlayerServiceImpl implements PlayerService{
	
	@Autowired
	private PlayerRepository repository;
	
	@Autowired
	private PlayerTemplateDAOImpl playerTemplateDAO;
	
	public String getPlayerById(String id) {
		return null;
	}
	
	public Player[] getPlayerByName(String name) {
		Player[] player = repository.findByName(name);
		if (player == null) throw new PlayerNotFoundException();
		return player;
	}
	
	public Player findOneByName(String name) {
		return playerTemplateDAO.findOneByName(name);
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
	

}
