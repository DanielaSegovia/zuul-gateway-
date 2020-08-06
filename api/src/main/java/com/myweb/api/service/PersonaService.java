package com.myweb.api.service;

import com.myweb.api.model.Persona;

public interface PersonaService {

    Persona guardarEstudiante(Persona persona);
    
    Persona findByDocumento(String documento);
}