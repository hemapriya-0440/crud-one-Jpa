package com.example.crudone_jpa.democrudonejpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crudone_jpa.democrudonejpa.entity.friend;
@Repository
public interface friendRepository extends JpaRepository<friend, Long> {

}
