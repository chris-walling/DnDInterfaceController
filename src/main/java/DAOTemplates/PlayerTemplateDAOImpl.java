package main.java.DAOTemplates;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import main.java.Model.Player;

@Repository
public class PlayerTemplateDAOImpl implements PlayerTemplateDAO {
	
	private final MongoTemplate mongoTemplate;
	
	@Autowired
	public PlayerTemplateDAOImpl(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}
	
	@Override
	public Player savePlayer(Player player) {
		mongoTemplate.save(player);
		return player;
	}
	
	public List<Player> getAllPlayers(){
		return mongoTemplate.findAll(Player.class);
	}
	
	public Player findOneByName(String name) {
		Query query = new Query();
		query.addCriteria(Criteria.where("name").is(name));
		return mongoTemplate.findOne(query, Player.class);
	}
	
	public List<Player> findByName(String name) {
		Query query = new Query();
		query.addCriteria(Criteria.where("name").is(name));
		return mongoTemplate.find(query, Player.class);
	}
	
	public Player findOneById(String id) {
		Query query = new Query();
		query.addCriteria(Criteria.where("id").is(id));
		return mongoTemplate.findOne(query, Player.class);
	}
	
	public Player updateOnePlayer(Player player) {
		mongoTemplate.save(player);
		return player;
	}
	
	public void deletePerson(String id) {
		Query query = new Query();
		query.addCriteria(Criteria.where("id").is(id));
		mongoTemplate.remove(query, Player.class);
	}

}
