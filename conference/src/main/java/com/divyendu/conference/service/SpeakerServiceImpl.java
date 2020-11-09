package com.jbattiste.conference.service;

import java.util.List;

import com.jbattiste.conference.model.Speaker;
import com.jbattiste.conference.repository.HibernateSpeakerRepositoryImpl;
import com.jbattiste.conference.repository.SpeakerRepository;

public class SpeakerServiceImpl implements SpeakerService{
	
	 private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();
	 
	 public List<Speaker> findAll(){
		 return repository.findAll();
	 }
}
