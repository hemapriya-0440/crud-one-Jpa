package com.example.crudone_jpa.democrudonejpa.runner;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.crudone_jpa.democrudonejpa.entity.friend;
import com.example.crudone_jpa.democrudonejpa.repo.friendRepository;
@Component
public class commandlineRepo extends commandlinerunner {
	private static final Logger log = 
			LoggerFactory.getLogger(commandlinerunner.class);
@Autowired
private friendRepository repo;
@Override
public void run(String... args) throws Exception {
friend frnd= new friend("Jack","best");
log.info("new user created:"+ frnd);
repo.save(frnd);
Optional<friend> frndid=repo.findById(1L);
log.info("new frndbyid created:"+ frndid);
List<friend> all=repo.findAll();
log.info("new all created:"+ all);
	}
}
