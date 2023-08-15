package com.example.estudianteprogramacion.controller;

import com.example.estudianteprogramacion.model.Tema;
import com.example.estudianteprogramacion.service.ITemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemaController {
 
    @Autowired
    private ITemaService temaServ;
    
    //crear un nuevo tema
    @PostMapping ("/tema/crear")
    public String saveTema(@RequestBody Tema tema){
        temaServ.saveTema(tema);
        return "Tema creado correctamente";
    }
    
    //para modificar los datos de un determinado tema
    @PutMapping("/tema/editar")
    public String editTema(@RequestBody Tema tema){
        temaServ.saveTema(tema);
        return "Tema editado correctamente";
    }
}
