package com.example.clinicaveterinaria.controller;

import com.example.clinicaveterinaria.dto.MascoDueDTO;
import com.example.clinicaveterinaria.model.Mascota;
import com.example.clinicaveterinaria.service.IMascotaService;
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
public class MascotaController {
    
    @Autowired
    private IMascotaService mascoServ;
    
    @GetMapping("/mascota/traer")
    public List<Mascota> getMascotas(){
        return mascoServ.getMascotas();
    }
    
    @PostMapping("/mascota/crear")
    public String saveMascota(@RequestBody Mascota masco){
        mascoServ.saveMascota(masco);
        return "Mascota creada";
    }
    
    @DeleteMapping("/mascota/eliminar/{id_mascota}")
    public String deleteMascota (@PathVariable Long id_mascota){
        mascoServ.deleteMascota(id_mascota);
        return "Mascota eliminada";
    }
    
    @PutMapping ("/mascota/editar")
    public String editMascota (@RequestBody Mascota masco){
        mascoServ.editMascota(masco);
        return "Mascota editada correctamente";
    }
    
    @GetMapping("/mascota/caniches")
    public List<Mascota> getPerroCani(){
        return mascoServ.getPerroCani();
    }
    
    @GetMapping("/mascota/mascoydue")
    public List<MascoDueDTO> getDatosCombi(){
        return mascoServ.getDatosCombi();
    }
    
}
