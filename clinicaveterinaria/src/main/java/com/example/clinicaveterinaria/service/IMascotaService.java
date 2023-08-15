package com.example.clinicaveterinaria.service;

import com.example.clinicaveterinaria.dto.MascoDueDTO;
import com.example.clinicaveterinaria.model.Mascota;
import java.util.List;

public interface IMascotaService {
    
    public List<Mascota>getMascotas();
    public void saveMascota(Mascota masco);
    public void deleteMascota(Long id);
    public Mascota findMascota(Long id);
    public void editMascota(Mascota masco);
    public List<Mascota>getPerroCani();
    public List<MascoDueDTO>getDatosCombi();
    
}
