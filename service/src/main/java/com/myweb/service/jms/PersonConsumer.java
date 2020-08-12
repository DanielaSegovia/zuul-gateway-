/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myweb.service.jms;

import com.fasterxml.jackson.databind.ObjectMapper;
import static com.myweb.service.config.config.PERSON_QUEUE;
import com.myweb.service.model.Person;
import java.io.IOException;
import javax.jms.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

/**
 *
 * @author Daniela Segovia
 */
@Component
public class PersonConsumer {

   /* 
    private static Logger log = LoggerFactory.getLogger(PersonConsumer.class);

    @JmsListener(destination = PERSON_QUEUE)
    public void receiveMessage(@Payload Person persona,
            @Headers MessageHeaders headers,
            Message message,
            Session session) { 
        log.info("Received <" + persona + ">");
    }
*/
  
    /*@Autowired
    private SedeServiceFacade sedeServiceFacade;*/
    
    @Autowired        
    ObjectMapper objectMapper = new ObjectMapper();

    
    @JmsListener(destination = PERSON_QUEUE)
    public void listener(String jsonInString) throws IOException {
        
        Person person = objectMapper.readValue(jsonInString, Person.class);
        System.out.println(person.id + person.document + person.name);
    }
}
