package main.java.service;

import java.util.List;

import main.java.Model.Spell;

public interface SpellService {
	
	public Spell saveSpell(Spell spell);
	public List<Spell> getAllSpells();
	public Spell findSpellById(String id);
	public Spell updateSpell(Spell spell);
	public void deleteSpell(String id);

}
