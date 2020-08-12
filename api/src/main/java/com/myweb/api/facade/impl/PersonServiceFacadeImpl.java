package com.myweb.api.facade.impl;

import com.myweb.api.model.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.myweb.api.service.PersonService;
import com.myweb.api.facade.PersonServiceFacade;

@Service
public class PersonServiceFacadeImpl implements PersonServiceFacade {

    @Autowired
    private PersonService personaService;

    @Override
    public Person create(Person persona) {
        return personaService.create(persona);
    }

}
