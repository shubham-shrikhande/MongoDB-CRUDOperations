package com.nit.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nit.document.Actor;

public interface ActorRepository extends MongoRepository<Actor, Integer> {

}
