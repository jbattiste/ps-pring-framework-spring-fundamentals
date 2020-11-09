package com.jbattiste.conference;

import com.jbattiste.conference.service.SpeakerService;
import com.jbattiste.conference.service.SpeakerServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
        SpeakerService service = new SpeakerServiceImpl();
        
        System.out.println(service.findAll().get(0).getFirstName());
    }
}
