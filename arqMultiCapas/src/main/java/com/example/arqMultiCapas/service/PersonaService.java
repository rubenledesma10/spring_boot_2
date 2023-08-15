package com.example.arqMultiCapas.service;

import com.example.arqMultiCapas.modelOEntity.Persona;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {

    @Override
    public void crearPersona(Persona perso) {
        //aca deberia ir toda la logica de creacion
        System.out.println("Persona creada");
    }

    @Override
    public List<Persona> traerPersonas() {
        //aca deberia ir la logica de deolver lista de persona
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    //metodos de logica de negocio
}
