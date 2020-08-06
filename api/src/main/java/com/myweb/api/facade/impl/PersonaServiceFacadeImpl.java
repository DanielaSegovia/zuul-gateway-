package com.myweb.api.facade.impl;

import com.myweb.api.facade.PersonaServiceFacade;
import com.myweb.api.model.Persona;
import com.myweb.api.service.PersonaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceFacadeImpl implements PersonaServiceFacade {

    @Autowired
    private PersonaService estudianteService;

    @Override
    public Persona guardarEstudiante(Persona persona) {
       return estudianteService.guardarEstudiante(persona);
    }

    @Override
    public Persona findByDocumento(String documento) {
        return estudianteService.findByDocumento(documento);
    }
    
}