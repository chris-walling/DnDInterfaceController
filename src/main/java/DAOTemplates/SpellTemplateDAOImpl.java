package main.java.DAOTemplates;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import main.java.Model.Spell;

@Repository
public class SpellTemplateDAOImpl implements SpellTemplateDAO {
	
	private final MongoTemplate mongoTemplate;
	
	@Autowired
	public SpellTemplateDAOImpl(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

	@Override
	public Spell saveSpell(Spell spell) {
		mongoTemplate.save(spell);
		return spell;
	}

	@Override
	public List<Spell> getAllSpells() {
		return mongoTemplate.findAll(Spell.class);
	}

	@Override
	public Spell findSpellById(String id) {
		return mongoTemplate.findOne(
				Query.query(Criteria.where("_id").is(id)), Spell.class);
	}

	@Override
	public Spell updateSpell(Spell spell) {
		mongoTemplate.save(spell);
		return spell;
	}

	@Override
	public void deleteSpell(String id) {
		mongoTemplate.remove(
				Query.query(Criteria.where("_id").is(id)));
	}

}
