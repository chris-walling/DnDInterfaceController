package main.java.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import main.java.Model.Player;
import main.java.entities.DnDResponseEntity;
import main.java.service.PlayerServiceImpl;

@RestController
public class PlayerController {
	
	public static final Logger logger = LoggerFactory.getLogger(PlayerController.class);
	
	@Autowired
	private PlayerServiceImpl playerService;
	
	@RequestMapping(value = "/PlayerSearch", method=RequestMethod.GET)
	public String getPlayer(@RequestParam(value="id") String id) {
		return playerService.getPlayerById(id);
	}
	
	@RequestMapping(value = "/getPlayerByName", method=RequestMethod.GET)
	public ResponseEntity<Player[]> findPlayerByName(@RequestParam(value="name") String name) {
		logger.info("Searching For Player: {}", name);
		return DnDResponseEntity
				.playerFound(playerService.getPlayerByName(name));
	}
	
	@RequestMapping(value = "/getOnePlayerByName", method=RequestMethod.GET)
	public ResponseEntity<Player> findOnePlayerByName(@RequestParam(value="name") String name) {
		logger.info("Searching For One Player By Name: {}", name);
		return DnDResponseEntity
				.playerFound(playerService.findOneByName(name));
	}
	
	@RequestMapping(value = "/getAllPlayers", method=RequestMethod.GET)
	public List<Player> getAllPlayers() {
		return playerService.getAllPlayers();
	}
	
	@RequestMapping(value = "/createNewPlayerByName", method=RequestMethod.POST)
	public ResponseEntity<Player> createNewPlayerByName(@RequestBody Player player) {
		logger.info("Creating Player: {}", player);
		
		return DnDResponseEntity
				.playerCreated(playerService.createPlayer(player));
	}
	
	@RequestMapping(value = "/deletePlayer", method=RequestMethod.DELETE)
	public ResponseEntity<Void> deletePlayer(@RequestParam(value="id") String id) {
		logger.info("Deleting Player By Id: {}", id);
		
		playerService.deletePlayer(id);
		return DnDResponseEntity.noContent().build();
	}

}
