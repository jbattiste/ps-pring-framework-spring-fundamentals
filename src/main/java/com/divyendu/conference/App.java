package com.jbattiste.conference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jbattiste.conference.configuration.AppConfig;
import com.jbattiste.conference.service.SpeakerService;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
    	
        //SpeakerService service = new SpeakerServiceImpl();
    	
    	SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);
    	//System.out.println(service);
        
        System.out.println(service.findAll().get(0).getLastName());
        System.out.println(service.findAll().get(0).getSeedNum());
    
        //SpeakerService service2 = appContext.getBean("speakerService", SpeakerService.class);
    	//System.out.println(service2);
    	
    }
}
 