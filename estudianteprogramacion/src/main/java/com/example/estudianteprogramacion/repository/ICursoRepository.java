package com.example.estudianteprogramacion.repository;

import com.example.estudianteprogramacion.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICursoRepository extends JpaRepository<Curso,Long> {
    
}
