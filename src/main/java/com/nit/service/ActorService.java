package com.nit.service;

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

}
