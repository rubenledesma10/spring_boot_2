package com.example.arqMultiCapas.service;

import com.example.arqMultiCapas.modelOEntity.Persona;
import java.util.List;

public interface IPersonaService {
    
    //declaro los metodos sin implementar
    public void crearPersona(Persona perso);
    public List <Persona> traerPersonas();
    
}
