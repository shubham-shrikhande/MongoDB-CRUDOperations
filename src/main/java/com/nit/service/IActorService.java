package com.nit.service;

import java.util.List;

import com.nit.document.Actor;

public interface IActorService {

	public String saveActor(Actor actor);
	public Actor getById(Integer id);
	public String deleteById(Integer id);
	public List<Actor> getAllActor();

}
