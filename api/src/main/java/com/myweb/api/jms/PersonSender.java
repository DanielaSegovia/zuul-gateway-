/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myweb.api.jms;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import static com.myweb.api.config.config.PERSON_QUEUE;
import com.myweb.api.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

/**
 *
 * @author Daniela Segovia
 */
@Service
public class PersonSender {

    ObjectMapper Obj = new ObjectMapper();

    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendQueue(Person persona) {
        try {
            String jsonStr = Obj.writeValueAsString(persona);
            System.out.println(jsonStr);
            jmsTemplate.convertAndSend(PERSON_QUEUE, jsonStr);
            System.out.println("### Mensaje ingresado en la cola ###");
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    /*
    private static Logger log = LoggerFactory.getLogger(PersonSender.class);
    @Autowired
    private JmsTemplate jmsTemp;   

    public void sendQueue(Person persona) throws Exception {
        log.info("Sending to the queue <" + persona.resource() + ">");               
        jmsTemp.convertAndSend(PERSON_QUEUE, persona.resource());        
    }   */
}
