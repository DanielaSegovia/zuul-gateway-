package com.myweb.api.facade;

import com.myweb.api.model.Persona;

public interface PersonaServiceFacade {

    Persona guardarEstudiante(Persona persona);
    
    Persona findByDocumento(String documento);
    
}