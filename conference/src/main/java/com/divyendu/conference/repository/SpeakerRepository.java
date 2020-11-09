package com.jbattiste.conference.repository;

import java.util.List;

import com.jbattiste.conference.model.Speaker;

public interface SpeakerRepository {

	List<Speaker> findAll();
}
