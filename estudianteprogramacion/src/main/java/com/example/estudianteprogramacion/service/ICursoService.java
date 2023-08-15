package com.example.estudianteprogramacion.service;

import com.example.estudianteprogramacion.dto.CursoTemaDTO;
import com.example.estudianteprogramacion.model.Curso;
import java.util.List;

public interface ICursoService {
    public List<Curso> getCursos();
    public void saveCurso(Curso curso);
    public void deleteCurso(Long id);
    public Curso findCurso(Long id);
    public void editCurso(Curso curso);
    public CursoTemaDTO temasPorCurso(Long id_curso); //para saber el tema por curso
    public List<Curso> getCursosJava(); //para traer todos los cursos de java
}
