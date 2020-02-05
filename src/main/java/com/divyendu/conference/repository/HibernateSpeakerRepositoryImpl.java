package com.divyendu.conference.repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.divyendu.conference.model.Speaker;

@Repository("hibernateSpeakerRepository")
@Profile("dev")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository{
	
	@Autowired
	private Calendar cal;
	
	//SpEL
	@Value("#{ T(java.lang.Math).random() * 100}")
	private double seedNum;

	public List<Speaker> findAll(){
			List<Speaker> speakers = new ArrayList<>();
			
			Speaker speaker = new Speaker();
			speaker.setFirstName("Divyendu");
			speaker.setLastName("Dutta");
			speaker.setSeedNum(seedNum);
			
			speakers.add(speaker);
			
			System.out.println("cal  "+cal.getTime());
			
			return speakers;
	}
}
