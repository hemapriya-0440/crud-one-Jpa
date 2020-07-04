package com.example.crudone_jpa.democrudonejpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class friend {
	@Id
	@GeneratedValue
private long id;
private String name;
private String role;
public friend( String name, String role) {
	super();
	this.name = name;
	this.role = role;
}
public long getId() {
	return id;
}
public String getName() {
	return name;
}
public String getRole() {
	return role;
}
public friend() {
	}
}
