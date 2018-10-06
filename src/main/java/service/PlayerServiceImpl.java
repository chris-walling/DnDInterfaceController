package main.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.java.Model.Player;
import main.java.exceptions.PlayerNotFoundException;
import main.java.repository.PlayerRepository;

@Service
public class PlayerServiceImpl implements PlayerService{
	
	@Autowired
	private PlayerRepository repository;
	
	public String getPlayerById(String id) {
		return null;
	}
	
	public Player getPlayerByName(String name) {
		Player player = repository.findByName(name);
		if (player == null) throw new PlayerNotFoundException();
		return player;
	}
	
	public List<Player> getAllPlayers() {
		return repository.findAll();
	}
	
	public Player createPlayer(Player player) {
		
		return repository.save(player);
	}
	

}
