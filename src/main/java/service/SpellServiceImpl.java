package main.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.java.DAOTemplates.SpellTemplateDAOImpl;
import main.java.Model.Spell;
import main.java.exceptions.SpellNotFoundException;

@Service
public class SpellServiceImpl implements SpellService {
	
	@Autowired
	private SpellTemplateDAOImpl spellTemplateDAO;

	@Override
	public Spell saveSpell(Spell spell) {
		return spellTemplateDAO.saveSpell(spell);
	}

	@Override
	public List<Spell> getAllSpells() {
		return spellTemplateDAO.getAllSpells();
	}

	@Override
	public Spell findSpellById(String id) {
		Spell spell = spellTemplateDAO.findSpellById(id);
		if (spell == null) throw new SpellNotFoundException();
		return spell;
	}

	@Override
	public Spell updateSpell(Spell spell) {
		Spell spellData = spellTemplateDAO.findSpellById(spell.get_id());
		if (spellData == null) throw new SpellNotFoundException();
		return spellTemplateDAO.saveSpell(spell);
	}

	@Override
	public void deleteSpell(String id) {
		spellTemplateDAO.deleteSpell(id);
	}

}
