package com.crick.api.s.repositories;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crick.api.s.entity.Match;



@Repository
public interface matchRepo extends JpaRepository<Match, Integer> {

	//match fetching by providing team name
	
	Optional<Match> findByTeamHeading(String teamHeading);
}
