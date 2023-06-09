package com.nit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.nit.document.Actor;
import com.nit.service.ActorService;

public class ActorRunner implements CommandLineRunner {

	@Autowired
	ActorService service;
	
	@Override
	public void run(String... args) throws Exception {

		Actor actor = new Actor();
		actor.setId(1);
		actor.setMovie("Dabang");
		actor.setName("Om Puri");
		actor.setAward("Best actor");
		String s=service.saveActor(actor);
		System.out.println(s);
	}

}
