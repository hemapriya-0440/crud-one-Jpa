package com.example.crudone_jpa.democrudonejpa.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.example.crudone_jpa.democrudonejpa.entity.friend;
import com.example.crudone_jpa.democrudonejpa.service.friendService;

@Component
public class commandlinerunner implements CommandLineRunner {
	private static final Logger log = 
			LoggerFactory.getLogger(commandlinerunner.class);
@Autowired
private friendService ser;
	@Override
	public void run(String... args) throws Exception {
friend frnd= new friend("Jack","best");
long insert=ser.insert(frnd);
log.info("new user created:"+ frnd);
	}

}
