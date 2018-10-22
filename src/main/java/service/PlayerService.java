package main.java.service;

import java.util.List;

import main.java.Model.Player;

public interface PlayerService {
	
	public Player getPlayerById(String id);
	
	public List<Player> getPlayersByName(String name);
	
	public List<Player> getAllPlayers();
	
	public Player createPlayer(Player player);
	
	public Player updatePlayer(Player player);

}
