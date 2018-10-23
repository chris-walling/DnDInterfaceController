package main.java.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import main.java.Model.Spell;
import main.java.entities.DnDResponseEntity;
import main.java.service.SpellServiceImpl;

@RestController
@RequestMapping("/spell")
public class SpellController {
	
	public static final Logger logger = LoggerFactory.getLogger(SpellController.class);
	
	@Autowired
	private SpellServiceImpl spellService;
	
	@RequestMapping(value = "/getAllSpells", method = RequestMethod.GET)
	public ResponseEntity<List<Spell>> getAllSpells() {
		return DnDResponseEntity
				.spellFound(spellService.getAllSpells());
	}
	
	@RequestMapping(value = "/createSpell", method = RequestMethod.POST)
	public ResponseEntity<Spell> createSpell(@RequestBody Spell spell) {
		//check if spell already exists
		return DnDResponseEntity
				.spellCreated(spellService.saveSpell(spell));
	}
	
	@RequestMapping(value = "/getSpellById", method = RequestMethod.GET)
	public ResponseEntity<Spell> getSpellById(@RequestParam String id){
		return DnDResponseEntity
				.spellFound(spellService.findSpellById(id));
	}

}
