package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.document.Actor;
import com.nit.repo.ActorRepository;

@Service
public class ActorService implements IActorService {

	@Autowired
	ActorRepository arepo;
	@Override
	public String saveActor(Actor actor) {
		Actor a=arepo.save(actor);
		return a+" is saved successfully.";
	}

	@Override
	public Actor getById(Integer id) {
		return arepo.findById(id).get();
	}

	@Override
	public String deleteById(Integer id) {
		arepo.deleteById(id);
		return "Deleted successfully!!";
	}

	@Override
	public List<Actor> getAllActor() {
		return arepo.findAll();
	}
}
