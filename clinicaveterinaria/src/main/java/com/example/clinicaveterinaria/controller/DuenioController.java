package com.example.clinicaveterinaria.controller;

import com.example.clinicaveterinaria.model.Duenio;
import com.example.clinicaveterinaria.service.IDuenioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DuenioController {
    
    @Autowired
    private IDuenioService duenioServ;
    
    
    @GetMapping("/duenios/traer")
    public List<Duenio> getDuenio(){
        return duenioServ.getDuenio();
    }
    
    @PostMapping("/duenios/crear")
    public String saveDuenio (@RequestBody Duenio duenio){
        duenioServ.saveDuenio(duenio);
        return "Dueño creado";
    }
    
    @DeleteMapping("/duenios/borrar/{id_duenio}")
    public String deleteDuenio (@PathVariable Long id_duenio){
        duenioServ.deleteDuenio(id_duenio);
        return "Dueño eliminado";
    }
    
    @PutMapping("/duenios/editar")
    public String editDuenio (@RequestBody Duenio duenio){
        duenioServ.editDuenio(duenio);
        return "Dueño editado correctametne";
    }
                
}
