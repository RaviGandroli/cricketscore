package com.crick.api.s.services;

import java.util.List;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.crick.api.s.entity.Match;

@Service
public interface matchServices {

	//get all matches
	List<Match> getAllMatches();
	
	//get live matches
	List<Match> getLiveMatches();
	
	//get cwc2023 point table
	List<List<String>> getPointTable();
}
