package com.myweb.api.controllers;

import com.myweb.api.model.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import com.myweb.api.facade.PersonServiceFacade;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonServiceFacade personaServiceFacade;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "Hola Mundo";
    }

    /*
    @PostMapping
    public Person store(@RequestBody Person person) {
        return personaServiceFacade.create(person);
    }*/

    
    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Person guardar(@RequestBody @Validated Person persona) {
        return personaServiceFacade.create(persona);
    }
    
}
