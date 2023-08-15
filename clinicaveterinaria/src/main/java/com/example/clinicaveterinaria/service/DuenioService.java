package com.example.clinicaveterinaria.service;

import com.example.clinicaveterinaria.model.Duenio;
import com.example.clinicaveterinaria.repository.IDuenioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DuenioService implements IDuenioService {

    @Autowired
    private IDuenioRepository duenioRepo;
    @Override
    public List<Duenio> getDuenio() {
        return duenioRepo.findAll();
    }

    @Override
    public void saveDuenio(Duenio duenio) {
        duenioRepo.save(duenio);
    }

    @Override
    public void deleteDuenio(Long id) {
        duenioRepo.deleteById(id);
    }

    @Override
    public Duenio findDuenio(Long id) {
        return duenioRepo.findById(id).orElse(null);
    }

    @Override
    public void editDuenio(Duenio duenio) {
        this.saveDuenio(duenio);
    }
    
}
