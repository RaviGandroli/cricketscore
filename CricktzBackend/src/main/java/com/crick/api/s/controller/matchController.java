package com.crick.api.s.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crick.api.s.entity.Match;
import com.crick.api.s.services.matchServices;

@RestController
@RequestMapping("/match")
public class matchController {
    @Autowired
	private matchServices matchservices;
    
        
    @GetMapping("/live")
	public ResponseEntity<List<Match>> getLiveMatches(){
		return new ResponseEntity<>(this.matchservices.getLiveMatches(),HttpStatus.OK);
	}
    
    @GetMapping("/allMatch")
    public ResponseEntity<List<Match>> getAllMatches(){
    	return new ResponseEntity<>(this.matchservices.getAllMatches(),HttpStatus.OK);
    }
    @GetMapping("/point-table")
    public ResponseEntity<?> getPointTable(){
    	return new ResponseEntity<>(this.matchservices.getPointTable(),HttpStatus.OK);
    }
}
