
package com.example.clinicaveterinaria.service;

import com.example.clinicaveterinaria.dto.MascoDueDTO;
import com.example.clinicaveterinaria.model.Mascota;
import com.example.clinicaveterinaria.repository.IMascotaRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaService implements IMascotaService {

    @Autowired
    private IMascotaRepository mascoRepo;
    
    @Override
    public List<Mascota> getMascotas() {
        return mascoRepo.findAll();
    }

    @Override
    public void saveMascota(Mascota masco) {
        mascoRepo.save(masco);
    }

    @Override
    public void deleteMascota(Long id) {
        mascoRepo.deleteById(id);
    }

    @Override
    public Mascota findMascota(Long id) {
        return mascoRepo.findById(id).orElse(null);
    }

    @Override
    public void editMascota(Mascota masco) {
        this.saveMascota(masco);
    }

    @Override
    public List<Mascota> getPerroCani() {
        List<Mascota> listaMascotas = this.getMascotas(); //traemos la lsita mascota
        List<Mascota> listaPerrosCani = new ArrayList<Mascota>(); //creamos una nueva arraylist para almencear los perros caniches
        for (Mascota masco : listaMascotas){ //recorremos la lsita de mascota
            if(masco.getEspecie().equalsIgnoreCase("perro")&&masco.getRaza().equalsIgnoreCase("caniche")){
                listaPerrosCani.add(masco); //si esta perro y raza que lo agregue a la lista de perros caniche
            }
        }
        
        return listaPerrosCani;
    }

    @Override
    public List<MascoDueDTO> getDatosCombi() {
        List<Mascota> listaMascotas = this.getMascotas(); //traigo la lista mascotas
        List<MascoDueDTO> listaMascoDue = new ArrayList<MascoDueDTO>(); //creo una lista para guardar los datos en comun de las mascotas y dueno
        MascoDueDTO mascoDue = new MascoDueDTO(); //creo una instancia de mascoDueDTO
        
        for (Mascota masco : listaMascotas){
            System.out.println(masco.getNombre());; 
            mascoDue.setApellido_duenio(masco.getDuenio().getApellido()); //seteamos los datos con los datos ya registrados de mascota y dueño
            mascoDue.setEspecie(masco.getEspecie());
            mascoDue.setNombre_duenio(masco.getDuenio().getNombreDuenio());
            mascoDue.setNombre_mascota(masco.getNombre());
            mascoDue.setRaza(masco.getRaza());
            
            listaMascoDue.add(mascoDue); //agrego a la lista
            mascoDue = new MascoDueDTO(); //reseteo para que se guarden los valores
        }
        return listaMascoDue;
    }
}
