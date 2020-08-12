package com.myweb.api.service.impl;

import com.myweb.api.jms.PersonSender;
import com.myweb.api.model.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.myweb.api.repository.PersonRepository;
import com.myweb.api.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

    //Inyección del repositorio Person
    @Autowired
    private PersonRepository personRepository;

    //Inyección de la clase Sender (Envía el mensaje)
    @Autowired
    private PersonSender personSender;

    @Override
    public Person create(Person person) {
        Person instance = personRepository.save(person);
        try {
            personSender.sendQueue(instance);
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }
        return instance;
    }

}
