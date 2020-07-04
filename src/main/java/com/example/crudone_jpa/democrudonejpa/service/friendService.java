package com.example.crudone_jpa.democrudonejpa.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.crudone_jpa.democrudonejpa.entity.friend;

@Repository
@Transactional
public class friendService {
	@PersistenceContext
	private EntityManager entityManager;
	public long insert(friend frnd) {
		entityManager.persist(frnd);
		return frnd.getId();
		
	}

}
