package com.jbattiste.conference.service;

import java.util.List;

import com.jbattiste.conference.model.Speaker;
import com.jbattiste.conference.repository.SpeakerRepository;

public class SpeakerServiceImpl implements SpeakerService{
	
	private SpeakerRepository repository;
	  
	public SpeakerServiceImpl() {}
	 
	public SpeakerServiceImpl(SpeakerRepository repository) {
		this.repository = repository;
	}


	public List<Speaker> findAll(){
		 return repository.findAll();
	 }

	public void setSpeakerRepository1(SpeakerRepository repository) {
		System.out.println("Inside setSpeakerRepository1");
		System.out.println(repository);
		this.repository = repository;
	}
	
	public void setSpeakerRepository2(SpeakerRepository repository) {
		System.out.println("Inside setSpeakerRepository2");
		System.out.println(repository);
		this.repository = repository;
	}
	 
	 
}
