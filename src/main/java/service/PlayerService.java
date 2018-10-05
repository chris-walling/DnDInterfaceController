package main.java.service;

import java.util.List;

import main.java.Model.Player;

public interface PlayerService {
	
	public String getPlayerById(String id);
	
	public String getPlayerByName(String name);
	
	public List<Player> getAllPlayers();
	
	public Player createPlayer(Player player);

}
