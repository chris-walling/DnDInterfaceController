package main.java.DAOTemplates;

import java.util.List;

import main.java.Model.Spell;

public interface SpellTemplateDAO {
	
	Spell saveSpell(Spell spell);
	List<Spell> getAllSpells();
	Spell findSpellById(String id);
	Spell updateSpell(Spell spell);
	void deleteSpell(String id);
	
}
