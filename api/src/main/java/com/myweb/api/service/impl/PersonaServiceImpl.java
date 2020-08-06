package com.myweb.api.service.impl;

import com.myweb.api.model.Persona;
import com.myweb.api.repository.PersonaRepository;
import com.myweb.api.service.PersonaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository estudianteRepository;

    @Override
    public Persona guardarEstudiante(Persona persona) {
        return estudianteRepository.save(persona);
    }
    
    @Override
    public Persona findByDocumento(String documento) {
        return estudianteRepository.findByDocumento(documento);
    }

    
}