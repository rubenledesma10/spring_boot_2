package com.example.estudianteprogramacion.service;

import com.example.estudianteprogramacion.dto.CursoTemaDTO;
import com.example.estudianteprogramacion.model.Curso;
import com.example.estudianteprogramacion.repository.ICursoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService implements ICursoService {

    @Autowired
    private ICursoRepository cursoRepo;
    
    @Override
    public List<Curso> getCursos() {
        return cursoRepo.findAll();
    }

    @Override
    public void saveCurso(Curso curso) {
        cursoRepo.save(curso);
    }

    @Override
    public void deleteCurso(Long id) {
        cursoRepo.deleteById(id);
    }

    @Override
    public Curso findCurso(Long id) {
        return cursoRepo.findById(id).orElse(null);
    }

    @Override
    public void editCurso(Curso curso) {
        this.cursoRepo.save(curso);
    }

    @Override
    public CursoTemaDTO temasPorCurso(Long id_curso) {
       
        CursoTemaDTO curTemDTO = new CursoTemaDTO (); //instanciamos el DTO
        Curso curso = this.findCurso(id_curso); //decimos que curso es igual al curso que encontramos por el id
        curTemDTO.setNombreCurso(curso.getNombre()); //seteamos el nombre del curso 
        curTemDTO.setListaTemas(curso.getListaTemas()); //seteamos la lista de temas
        return curTemDTO;
    }

    @Override
    public List<Curso> getCursosJava() {
        String palabra = "Java"; //guardamos en un string la palabra java
        String textoComparar; //hacemos un string para comprar el texto
        
        List<Curso> listaCursos = this.getCursos(); //traemos la lista cursos
        List<Curso> listaCursosJava = new ArrayList<Curso>(); //creamos una lista de cursos java para guardar los cursos java
        
        for (Curso cur : listaCursos) {
            textoComparar = cur.getNombre();
            boolean contieneJava = textoComparar.contains(palabra); //si el texto tiene la palabra java
            if (contieneJava == true) {
                listaCursosJava.add(cur); //que la agregue en la lista de cursos java
            }
        }
    return listaCursosJava;
    }
    
}
