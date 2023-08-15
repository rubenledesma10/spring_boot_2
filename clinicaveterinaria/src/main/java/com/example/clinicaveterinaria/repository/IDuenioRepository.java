package com.example.clinicaveterinaria.repository;

import com.example.clinicaveterinaria.model.Duenio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDuenioRepository extends JpaRepository<Duenio,Long>  {
   
}
