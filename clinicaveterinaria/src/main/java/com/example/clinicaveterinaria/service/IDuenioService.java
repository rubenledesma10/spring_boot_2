package com.example.clinicaveterinaria.service;

import com.example.clinicaveterinaria.model.Duenio;
import java.util.List;

public interface IDuenioService {
    
    public List<Duenio>getDuenio();
    public void saveDuenio(Duenio duenio);
    public void deleteDuenio(Long id);
    public Duenio findDuenio(Long id);
    public void editDuenio(Duenio duenio);
    
}
